FROM openjdk:8-slim-buster
LABEL author="netbuffer"
WORKDIR /
ADD target/spring-boot-admin-demo-client.jar /
ENTRYPOINT java ${JAVA_OPTS} -jar /spring-boot-admin-demo-client.jar