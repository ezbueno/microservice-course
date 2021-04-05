Criando e testando containers Docker
Criar rede docker para sistema humanresources
docker network create humanresources-net
Testando perfil dev com Postgresql no Docker
docker pull postgres:12-alpine

docker run -p 5432:5432 --name humanresources-worker-pg12 --network humanresources-net -e POSTGRES_PASSWORD=1234567 -e POSTGRES_DB=db_humanresources_worker postgres:12-alpine

docker run -p 5432:5432 --name humanresources-user-pg12 --network humanresources-net -e POSTGRES_PASSWORD=1234567 -e POSTGRES_DB=db_humanresources_user postgres:12-alpine
humanresources-config-server
FROM openjdk:11
VOLUME /tmp
EXPOSE 8888
ADD ./target/humanresources-config-server-0.0.1-SNAPSHOT.jar humanresources-config-server.jar
ENTRYPOINT ["java","-jar","/humanresources-config-server.jar"]
mvnw clean package

docker build -t humanresources-config-server:v1 .

docker run -p 8888:8888 --name humanresources-config-server --network humanresources-net -e GITHUB_USER=ezbueno -e GITHUB_PASS= humanresources-config-server:v1
humanresources-eureka-server
FROM openjdk:11
VOLUME /tmp
EXPOSE 8761
ADD ./target/humanresources-eureka-server-0.0.1-SNAPSHOT.jar humanresources-eureka-server.jar
ENTRYPOINT ["java","-jar","/humanresources-eureka-server.jar"]
mvnw clean package

docker build -t humanresources-eureka-server:v1 .

docker run -p 8761:8761 --name humanresources-eureka-server --network humanresources-net humanresources-eureka-server:v1
humanresources-worker
FROM openjdk:11
VOLUME /tmp
ADD ./target/humanresources-worker-0.0.1-SNAPSHOT.jar humanresources-worker.jar
ENTRYPOINT ["java","-jar","/humanresources-worker.jar"]
mvnw clean package -DskipTests

docker build -t humanresources-worker:v1 .

docker run -P --network humanresources-net humanresources-worker:v1
humanresources-user
FROM openjdk:11
VOLUME /tmp
ADD ./target/humanresources-user-0.0.1-SNAPSHOT.jar humanresources-user.jar
ENTRYPOINT ["java","-jar","/humanresources-user.jar"]
mvnw clean package -DskipTests

docker build -t humanresources-user:v1 .

docker run -P --network humanresources-net humanresources-user:v1
humanresources-payroll
FROM openjdk:11
VOLUME /tmp
ADD ./target/humanresources-payroll-0.0.1-SNAPSHOT.jar humanresources-payroll.jar
ENTRYPOINT ["java","-jar","/humanresources-payroll.jar"]
mvnw clean package -DskipTests

docker build -t humanresources-payroll:v1 .

docker run -P --network humanresources-net humanresources-payroll:v1
humanresources-oauth
FROM openjdk:11
VOLUME /tmp
ADD ./target/humanresources-oauth-0.0.1-SNAPSHOT.jar humanresources-oauth.jar
ENTRYPOINT ["java","-jar","/humanresources-oauth.jar"]
mvnw clean package -DskipTests

docker build -t humanresources-oauth:v1 .

docker run -P --network humanresources-net humanresources-oauth:v1
humanresources-api-gateway-zuul
FROM openjdk:11
VOLUME /tmp
EXPOSE 8765
ADD ./target/humanresources-api-gateway-zuul-0.0.1-SNAPSHOT.jar humanresources-api-gateway-zuul.jar
ENTRYPOINT ["java","-jar","/humanresources-api-gateway-zuul.jar"]
mvnw clean package -DskipTests

docker build -t humanresources-api-gateway-zuul:v1 .

docker run -p 8765:8765 --name humanresources-api-gateway-zuul --network humanresources-net humanresources-api-gateway-zuul:v1
Alguns comandos Docker
Criar uma rede Docker

docker network create <nome-da-rede>
Baixar imagem do Dockerhub

docker pull <nome-da-imagem:tag>
Ver imagens

docker images
Criar/rodar um container de uma imagem

docker run -p <porta-externa>:<porta-interna> --name <nome-do-container> --network <nome-da-rede> <nome-da-imagem:tag> 
Listar containers

docker ps

docker ps -a
Acompanhar logs do container em execução

docker logs -f <container-id>