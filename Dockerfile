##FROM will pull openjdk from Docker repo.
FROM openjdk:8-jdk-alpine

##copy build jar form target folder to root folder of the Docker.
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

##expose the port 8080.
EXPOSE 8080

##execute the command given.
ENTRYPOINT ["java", "-jar", "/app.jar"]