<!-- network -->

1create docker network:
docker network create spring-mysql

<!-- mysql -->

1build mysql image:
docker pull mysql:latest
2build mysql image container:
docker run --network spring-mysql --name mysql -e MYSQL_ROOT_PASSWORD=password -d mysql:latest

<!-- spring app -->

1 build spring app:
./mvnw clean package
2 build spring image:
docker build -t spring:latest .
3 run spring docker container :
docker run --network spring-mysql --name spring-container -p 8080:8080 -e DB_HOST=mysql DB_PORT=3306 -d spring:latest

<!-- ps -->

1
DB_HOST should be database container name;
DB_PORT should be database in docker port , not to local port;
