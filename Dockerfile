FROM maven:3.8.6-eclipse-temurin-11

ARG JAR_FILE=target/sensor-demo-api-0.0.1-SNAPSHOT.jar

COPY $JAR_FILE app.jar

ENTRYPOINT ["java","-jar","app.jar"]