FROM openjdk:17-alpine

WORKDIR /app
COPY ./target/subscription.jar /app

EXPOSE 8080

CMD ["java", "-jar", "subscription.jar"]
