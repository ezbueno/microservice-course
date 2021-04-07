FROM openjdk:11
VOLUME /tmp
ADD ./target/humanresources-payroll-0.0.1-SNAPSHOT.jar humanresources-payroll.jar
ENTRYPOINT ["java","-jar","/humanresources-payroll.jar"]