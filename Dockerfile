FROM openjdk:17

WORKDIR /app

# Copia el archivo JAR de la aplicación
COPY ./build/libs/TopicosApi-0.0.1-SNAPSHOT.jar /app/topicosapi.jar

# Copia el archivo del agente JaCoCo
COPY org.jacoco.agent-0.8.8-runtime.jar /app/jacoco-agent.jar

EXPOSE 8081
EXPOSE 6300

# Comando para iniciar la aplicación con el agente JaCoCo
CMD ["java", "-javaagent:/app/jacoco-agent.jar=output=tcpserver,address=localhost,port=6300", "-jar", "/app/topicosapi.jar"]







