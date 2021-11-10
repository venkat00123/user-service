FROM openjdk:11
ADD target/user-service-0.0.1-SNAPSHOT.jar  user-service-0.0.1-SNAPSHOT.jar
EXPOSE 8086
ENTRYPOINT ["java", "-jar", "user-service-0.0.1-SNAPSHOT.jar"]