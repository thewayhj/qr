FROM adoptopenjdk/openjdk17
CMD ["./mvnw", "clean", "package"]
ARG JAR_FILE_PATH=target/*.jar
COPY ${JAR_FILE_PATH} application-was.jar
ENTRYPOINT ["java", "-jar", "app.jar"]