FROM maven:3.9-eclipse-termurin-21 AS builder
WORKDIR /app
copy pom.xml .
RUN mvn-dependency:go-offline
copy src ./src
RUN mvn package -DskipTests
FROM openjdk:25-jdk
WORKDIR /app
COPY --from=builder /app/target/algoDemonstration-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]