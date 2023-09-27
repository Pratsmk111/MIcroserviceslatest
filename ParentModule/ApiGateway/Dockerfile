# Use a base image with Java 11 JRE
FROM openjdk:17

# Set the working directory inside the container
WORKDIR /app

# Copy your application JAR into the container
COPY target/Api-Gateway-0.0.1-SNAPSHOT.jar Api-Gateway-0.0.1-SNAPSHOT.jar

# Specify the command to run your Java application
CMD ["java", "-jar", "Api-Gateway-0.0.1-SNAPSHOT.jar"]
