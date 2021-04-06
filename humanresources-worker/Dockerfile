FROM openjdk:11
VOLUME /tmp
ADD ./target/humanresources-worker-0.0.1-SNAPSHOT.jar humanresources-worker.jar
ENTRYPOINT ["java","-jar","/humanresources-worker.jar"]