# Dockerized-Web-App # 

This is a sample web application written using ```open-JDK-14```, ```spring-boot``` and ```MySQL8```
to understand the basic docerization of a web-application.

## Prerequisite ##

* Open-JDK-14
* Maven 3.x
* Spring Boot 2.x
* MySQL 8.x

## How to build and run ##

* Run following command from the project-top-level.

```bash
    mvn clean install
```

* Go into ```target/docker-sample-app``` directory.

```bash
    cd target/docker-sample-app
```

* Run following command.

```bash
    ./bin/docker-sample-app start;
```

## Docker Setup ##

* To create the ```docker-image``` for web-application run following command from project-top-level (after building the project).

```bash
    docker build --file=./docker/Dockerfile.server --tag=simple-web-service:latest --rm=true .
```

** Note : If you are trying to include it to docker-hub use following **

```bash
    docker build --file=./docker/Dockerfile.server -t <docker-hub-user-name>/simple-web-service:latest --rm=true .
```

```bash
    docker push <docker-hub-user-name>/simple-web-service:latest
```

* To start the container run-following command from command-line.

```bash
    docker container run -d --name first-docker-setup -p 10011:10011  simple-web-service:latest
```

* To test whether the web-application working properly go to ```http://localhost:10011/management/employee``` in your 
web browser.

## Docker Compose Setup ##

* Go into ```docker-compose``` directory.

```bash
    cd docker-compose
```

* Run following command.

```bash
    docker-compose -f docker-compose-dev-env.yml up
```