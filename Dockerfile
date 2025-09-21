FROM eclipse-temurin:25-jdk-jammy
WORKDIR /app
copy target/algoDemonstration-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]