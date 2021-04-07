FROM openjdk:11
VOLUME /tmp
ADD ./target/humanresources-oauth-0.0.1-SNAPSHOT.jar humanresources-oauth.jar
ENTRYPOINT ["java","-jar","/humanresources-oauth.jar"]