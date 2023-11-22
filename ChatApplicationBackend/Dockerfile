FROM openjdk:17-jdk
WORKDIR /app
COPY target/*.jar /app/ChatApplication.jar
EXPOSE 8090
CMD ["java", "-jar", "ChatApplication.jar"]