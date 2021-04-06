FROM openjdk:11
VOLUME /tmp
EXPOSE 8761
ADD ./target/humanresources-eureka-server-0.0.1-SNAPSHOT.jar humanresources-eureka-server.jar
ENTRYPOINT ["java","-jar","/humanresources-eureka-server.jar"]