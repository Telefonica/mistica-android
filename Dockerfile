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
COPY --from=adoptopenjdk/openjdk11:jdk-11.0.12_7 /opt/java/openjdk /opt/java/openjdk
ENV JAVA_HOME /opt/java/openjdk
ENV PATH="/opt/java/openjdk/bin:$PATH"

# Android SDK
ENV ANDROID_SDK 31
ENV EMULATOR_VERSION 29
ENV ANDROID_BUILD 31.0.0
ENV CMDLINE_TOOLS_VERSION 7583922
ENV ANDROID_SDK_ROOT /opt/android-sdk

RUN wget -q https://dl.google.com/android/repository/commandlinetools-linux-${CMDLINE_TOOLS_VERSION}_latest.zip -O temp.zip && \
	mkdir -p ${ANDROID_SDK_ROOT}/cmdline-tools/tools/bin && \
	mkdir -p ${ANDROID_SDK_ROOT}/cmdline-tools/tools/lib && \
	unzip temp.zip -d ${ANDROID_SDK_ROOT} && \
	rm temp.zip && \
	mv ${ANDROID_SDK_ROOT}/cmdline-tools/bin/* ${ANDROID_SDK_ROOT}/cmdline-tools/tools/bin && \
	mv ${ANDROID_SDK_ROOT}/cmdline-tools/lib/* ${ANDROID_SDK_ROOT}/cmdline-tools/tools/lib

ENV PATH /usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:$ANDROID_SDK_ROOT/cmdline-tools/tools/bin:$PATH
ENV PATH $ANDROID_SDK_ROOT/emulator:$ANDROID_SDK_ROOT/platform-tools:$PATH

RUN yes | sdkmanager --licenses
RUN yes | sdkmanager --install "tools" "platform-tools" "build-tools;$ANDROID_BUILD"
RUN yes | sdkmanager --install "extras;android;m2repository" "extras;google;google_play_services" "extras;google;m2repository"
RUN yes | sdkmanager --install "platforms;android-$ANDROID_SDK"
RUN yes | sdkmanager --update


# adb server
EXPOSE 5037
# VNC
EXPOSE 5900-5910
