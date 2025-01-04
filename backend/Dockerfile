FROM openjdk:17-jdk-slim

WORKDIR /app

COPY greeting/target/greeting-0.0.1.jar /app/app.jar

EXPOSE 8081

# Jalankan aplikasi
CMD ["java", "-jar", "/app/app.jar"]