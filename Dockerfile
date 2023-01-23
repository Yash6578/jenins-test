#This is docker file....
FROM openjdk:8
EXPOSE 8080
COPY /target/jenins-test-0.0.1-SNAPSHOT jenins-test-0.0.1-SNAPSHOT
ENTRYPOINT [ "java", "-jar", "jenins-test-0.0.1-SNAPSHOT"]
