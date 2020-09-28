FROM ubuntu:16.04

ENV DEBIAN_FRONTEND noninteractive

RUN \
	dpkg --add-architecture i386 && \
	apt-get update && \
	apt-get install -y software-properties-common wget git && \
	apt-get clean && rm -rf /var/lib/apt/lists/*

RUN \
	apt-get update && \
	# 32-bits compatibility
	apt-get install -y libstdc++6:i386 && \
	# unzip
	apt-get install -y unzip && \
	# git
	apt-get install -y git

# Java
COPY --from=adoptopenjdk/openjdk8:jdk8u192-b12 /opt/java/openjdk /opt/java/openjdk
ENV JAVA_HOME /opt/java/openjdk
ENV PATH="/opt/java/openjdk/bin:$PATH"

RUN wget -q https://dl.google.com/android/repository/sdk-tools-linux-3859397.zip -O temp.zip; unzip temp.zip -d /opt/android-sdk-linux/; rm temp.zip

ENV ANDROID_HOME /opt/android-sdk-linux
ENV LD_LIBRARY_PATH $ANDROID_HOME/tools/lib:$ANDROID_HOME/tools/lib64
ENV PATH /usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:$ANDROID_HOME/tools:$ANDROID_HOME/platform-tools:$ANDROID_HOME/tools/bin:$PATH

RUN yes | sdkmanager --licenses
RUN yes | sdkmanager "tools" "platform-tools" "build-tools;30.0.1"
RUN yes | sdkmanager "extras;android;m2repository" "extras;google;google_play_services" "extras;google;m2repository"
RUN yes | sdkmanager "platforms;android-29"
RUN yes | sdkmanager --update

RUN git config user.name "Mistica" && git config user.email "android@tuenti.com"

# adb server
EXPOSE 5037
