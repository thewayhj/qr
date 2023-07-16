FROM openjdk:17
ARG JAR_FILE=datamart-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} datamart-was.jar
ENTRYPOINT ["java","-jar","/datamart-was.jar"]