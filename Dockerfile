#This is docker file....
FROM openjdk:latest
EXPOSE 8080
COPY /target/jenins-test-0.0.1-SNAPSHOT.jar jenins-test-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java", "-jar", "jenins-test-0.0.1-SNAPSHOT.jar"]
