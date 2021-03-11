#FROM openjdk:8-jdk-alpine
#EXPOSE 4999
#ARG JAR_FILE=target/demo-app-1.0.0.jar
#ADD ${JAR_FILE} config-service.jar
#ENTRYPOINT ["java","-jar","/config-service.jar"]

FROM adoptopenjdk/openjdk11:jre-11.0.6_10-alpine
RUN apk --no-cache add curl
EXPOSE 4999
HEALTHCHECK --start-period=30s --interval=5s CMD curl -f http://config-service:4999/health || exit 1
CMD java -jar config-service-0.0.1-SNAPSHOT.jar
COPY build/libs/config-service-0.0.1-SNAPSHOT.jar .