
FROM amazoncorretto:21-alpine-jdk

WORKDIR /app

# Copia el archivo JAR generado
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar



ENTRYPOINT ["java", "-jar", "/app/app.jar"]
