#Start with a base image containing Java runtime
FROM openjdk:17-jdk-slim as build

#Information around who maintains the image
MAINTAINER ciontcristian

# Add the application's jar to the container
COPY target/companies-0.0.1-SNAPSHOT.jar companies-0.0.1-SNAPSHOT.jar

#execute the application
ENTRYPOINT ["java","-jar","/companies-0.0.1-SNAPSHOT.jar"]