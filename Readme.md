# Dockerized-Web-App # 

This is a sample web application written using ```open-JDK-14```, ```spring-boot``` and ```MySQL8```
to understand the basic docerization of a web-application.

## Prerequisets ##

* Open-JDK-14
* Maven 3.x
* Spring Boot 2.x
* MySQL 8.x

## How to build and run ##

* Run following command from the project-top-level.

```bash
    mvn clean install
```

* Go into ```target/docker-sample-app```.

```bash
    cd target/docker-sample-app
```

* Run following command.

```bash
    ./bin/docker-sample-app start;
```