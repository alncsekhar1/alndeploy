FROM openjdk:8
EXPOSE 8080
ADD target/deploy-0.0.1-SNAPSHOT.jar deploy-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/deploy-0.0.1-SNAPSHOT.jar"]
