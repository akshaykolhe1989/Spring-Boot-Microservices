FROM adoptopenjdk/openjdk11:jre-11.0.6_10-alpine
RUN apk --no-cache add curl
EXPOSE 5006
HEALTHCHECK --start-period=30s --interval=5s CMD curl -f http://db-service:5006/health || exit 1
CMD java -jar db-service-0.0.1-SNAPSHOT.jar
COPY build/libs/db-service-0.0.1-SNAPSHOT.jar .