# Use a base image with Java (choose the appropriate version)
FROM openjdk:17

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/HotelService-0.0.1-SNAPSHOT.jar HotelService-0.0.1-SNAPSHOT.jar

# Specify the command to run your Spring Boot application
CMD ["java", "-jar", "HotelService-0.0.1-SNAPSHOT.jar"]

