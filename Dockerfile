FROM openjdk:17.0.2-slim-buster
RUN mkdir /app
COPY /build/libs/*.jar /app/app.jar
EXPOSE 5000
ENTRYPOINT ["java", "-jar", "/app/app.jar"]