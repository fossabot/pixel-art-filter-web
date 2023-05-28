FROM eclipse-temurin:17-jdk
MAINTAINER admin@keke125.com

COPY target/*.jar /app/pafw.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/pafw.jar"]
