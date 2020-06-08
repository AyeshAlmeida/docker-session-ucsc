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

## How to use this setup for learning ##

* In GIT checkout to ```initial``` branch.

* All the docker related configurations will be empty there.

* Try to Fill them up and run the system.

* If you ever forget anything, check out to ```complete``` branch in GIT and refresh.

* All used commands in session could be found [here](guides/used-commands.md)