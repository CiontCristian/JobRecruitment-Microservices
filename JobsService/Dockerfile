#Start with a base image containing Java runtime
FROM openjdk:17-jdk-slim as build

#Information around who maintains the image
MAINTAINER ciontcristian

# Add the application's jar to the container
COPY target/jobs-0.0.1-SNAPSHOT.jar jobs-0.0.1-SNAPSHOT.jar

#execute the application
ENTRYPOINT ["java","-jar","/jobs-0.0.1-SNAPSHOT.jar"]