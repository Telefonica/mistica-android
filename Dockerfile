FROM ubuntu:16.04

ENV DEBIAN_FRONTEND noninteractive

RUN \
    dpkg --add-architecture i386 && \
    apt-get update && \
    apt-get install -y software-properties-common wget git && \
    add-apt-repository -y ppa:webupd8team/java && \
    apt-get clean && rm -rf /var/lib/apt/lists/*

RUN \
    echo oracle-java8-installer shared/accepted-oracle-license-v1-1 select true | debconf-set-selections && \
    apt-get update && \
    # 32-bits compatibility
    apt-get install -y libstdc++6:i386 && \
    # unzip
    apt-get install -y unzip && \
    # Java
    apt-get install -y oracle-java8-installer && \
    apt-get clean && rm -rf /var/lib/apt/lists/* && \
    rm -rf /var/cache/oracle-jdk8-installer

RUN wget -q https://dl.google.com/android/repository/sdk-tools-linux-3859397.zip -O temp.zip; unzip temp.zip -d /opt/android-sdk-linux/; rm temp.zip

ENV ANDROID_HOME /opt/android-sdk-linux
ENV LD_LIBRARY_PATH $ANDROID_HOME/tools/lib:$ANDROID_HOME/tools/lib64
ENV PATH /usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:$ANDROID_HOME/tools:$ANDROID_HOME/platform-tools:$ANDROID_HOME/tools/bin:$ANDROID_HOME/emulator

RUN yes | sdkmanager --licenses
RUN yes | sdkmanager "tools" "platform-tools" "build-tools;30.0.1"
RUN yes | sdkmanager "extras;android;m2repository" "extras;google;google_play_services" "extras;google;m2repository"
RUN yes | sdkmanager "platforms;android-29"

# adb server
EXPOSE 5037
