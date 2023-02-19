FROM openjdk:17-alpine

# Create and set working directory
RUN mkdir /app
WORKDIR /app

# Copy JAR file into container
COPY target/product-service-0.0.1-SNAPSHOT.jar /app/product-service.jar

# Set the command to run the service
CMD ["java", "-jar", "/app/product-service.jar"]

# Expose the same port as the microservice
EXPOSE 8081
 
