FROM openjdk:11
VOLUME /tmp
EXPOSE 8888
ADD ./target/humanresources-config-server-0.0.1-SNAPSHOT.jar humanresources-config-server.jar
ENTRYPOINT ["java","-jar","/humanresources-config-server.jar"]