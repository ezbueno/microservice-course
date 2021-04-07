FROM openjdk:11
VOLUME /tmp
EXPOSE 8765
ADD ./target/humanresources-api-gateway-zuul-0.0.1-SNAPSHOT.jar humanresources-api-gateway-zuul.jar
ENTRYPOINT ["java","-jar","/humanresources-api-gateway-zuul.jar"]