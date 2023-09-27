# Use an official OpenJDK runtime as a parent image
FROM openjdk:17

# Set the working directory to /app
WORKDIR /app

# Copy the JAR file into the container at /app
COPY target/RatingService-0.0.1-SNAPSHOT.jar RatingService-0.0.1-SNAPSHOT.jar

# Run the Java application when the container starts
CMD ["java", "-jar", "RatingService-0.0.1-SNAPSHOT.jar"]
