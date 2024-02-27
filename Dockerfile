FROM openjdk:19-jdk
COPY target/login-1-0.0.1-SNAPSHOT.jar .
EXPOSE 8080
ENTRYPOINT [ "java","-jar","login-1-0.0.1-SNAPSHOT.jar" ]
