FROM adoptopenjdk/openjdk11:jre-11.0.6_10-alpine
RUN apk --no-cache add curl
EXPOSE 5000
HEALTHCHECK --start-period=30s --interval=5s CMD curl -f http://discovery-service:5000/health || exit 1
CMD java -jar discovery-service-0.0.1-SNAPSHOT.jar
COPY build/libs/discovery-service-0.0.1-SNAPSHOT.jar .