# spring-boot-docker-sample

## Run book
You need Java 11

### Build
Build docker image:
./mvnw spring-boot:build-image

### Run docker image
docker run -d --name spring-boot-docker-sample -p8080:8080 spring-boot-docker-sample:0.0.1-SNAPSHOT