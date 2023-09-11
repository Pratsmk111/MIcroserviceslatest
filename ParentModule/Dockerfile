# Use a base image with Java 11 installed
FROM openjdk:17

# Expose the port your Spring Boot application listens on
EXPOSE 9191

# Copy the Spring Boot JAR file into the container
ADD target/spring-boot-docker.jar spring-boot-docker.jar

# Specify the command to run your Spring Boot application
ENTRYPOINT ["java", "-jar", "spring-boot-docker.jar"]
