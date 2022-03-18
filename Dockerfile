FROM java:8-jdk-alpine
COPY ./target/hello-0.0.1-SNAPSHOT.jar app.jar

CMD [ "sh", "-c", "java -jar /app.jar" ]
