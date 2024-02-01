from openjdk:12-alpine

COPY ./target/storedelivery-0.0.1-SNAPSHOT.jar /app/storedelivery-0.0.1-SNAPSHOT.jar

WORKDIR /app

ENTRYPOINT ["java", "-jar", "storedelivery-0.0.1-SNAPSHOT.jar"]

EXPOSE 8080