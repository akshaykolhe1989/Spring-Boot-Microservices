FROM adoptopenjdk/openjdk11:jre-11.0.6_10-alpine
RUN apk --no-cache add curl
EXPOSE 5002
HEALTHCHECK --start-period=30s --interval=5s CMD curl -f http://discovery-service:5001/health || exit 1
CMD java -jar order-service-0.0.1-SNAPSHOT.jar
COPY build/libs/order-service-0.0.1-SNAPSHOT.jar .