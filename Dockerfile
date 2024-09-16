#
# Build stage
#
FROM maven:3.8.2-jdk-11 AS build
COPY . .
RUN mvn clean package -Pdev -DskipTests

#
# Package stage
#
FROM openjdk:11-jdk-slim
COPY --from=build /target/*.jar fingerprint_database.jar
# ENV PORT=8080
# EXPOSE 8080
ENTRYPOINT ["java","-jar","fingerprint_database.jar"]