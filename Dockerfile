FROM alpine:latest
FROM amazoncorretto:21-alpine-jdk



COPY /target/demo-0.0.1-SNAPSHOT.jar app.jar

entrypoint ["java", "-jar", "/app.jar"]
CMD ["/bin/sh"]