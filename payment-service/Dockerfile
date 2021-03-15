FROM adoptopenjdk/openjdk11:jre-11.0.6_10-alpine
RUN apk --no-cache add curl
EXPOSE 5005
HEALTHCHECK --start-period=30s --interval=5s CMD curl -f http://payment-service:5005/health || exit 1
CMD java -jar payment-service-0.0.1-SNAPSHOT.jar
COPY build/libs/payment-service-0.0.1-SNAPSHOT.jar .