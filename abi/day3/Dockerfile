FROM openjdk:8-jdk-alpine
MAINTAINER kabinav.002@gmial.com

ARG JAR_FILE=gs-spring-boot-docker-master/complete/target/*.jar

COPY ${JAR_FILE} app.jar

CMD ["java","-jar","/app.jar"]
