FROM adoptopenjdk/openjdk8:alpine-jre
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/playerdb-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]