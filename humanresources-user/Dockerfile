FROM openjdk:11
VOLUME /tmp
ADD ./target/humanresources-user-0.0.1-SNAPSHOT.jar humanresources-user.jar
ENTRYPOINT ["java","-jar","/humanresources-user.jar"]