# Used Commands in Session #

* Run ```MySQL 8``` in ```docker```.

```shell script
    docker run --name=mysql-dev-session -p 3306:3306 -e MYSQL_ROOT_PASSWORD=password -d mysql/mysql-server:8.0.13
```

* Log into ```MySQL``` using ```docker```.

```shell script
    docker exec -it mysql-dev-session mysql -uroot -ppassword
```

* Verify your ```docker``` installation.

```shell script
    docker run hello-world
```

* Adding new user to ```MySQL``` and create database.

```shell script
    CREATE USER 'db_user'@'%' IDENTIFIED BY 'password_123#';
    GRANT ALL PRIVILEGES ON *.* TO 'db_user'@'%' WITH GRANT OPTION;
    CREATE DATABASE `employee_mng_db`;
```