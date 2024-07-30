# Usa una imagen base de Jenkins
FROM jenkins/jenkins:lts

# Instala Gradle
USER root
RUN apt-get update && apt-get install -y wget unzip \
    && wget https://services.gradle.org/distributions/gradle-7.4-bin.zip -P /tmp \
    && unzip /tmp/gradle-7.4-bin.zip -d /opt \
    && ln -s /opt/gradle-7.4/bin/gradle /usr/bin/gradle \
    && rm /tmp/gradle-7.4-bin.zip
USER jenkins

