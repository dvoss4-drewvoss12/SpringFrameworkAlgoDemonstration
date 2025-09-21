FROM openjdk:25-jdk
WORKDIR /app
copy target/algoDemonstration-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]