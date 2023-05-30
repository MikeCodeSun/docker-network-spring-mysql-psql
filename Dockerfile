FROM openjdk:21

ENV DB_HOST=mysql \
    DB_PORT=3306

WORKDIR /server

COPY /target/compose-0.0.1-SNAPSHOT.jar /server/

CMD [ "java", "-jar", "compose-0.0.1-SNAPSHOT.jar" ]