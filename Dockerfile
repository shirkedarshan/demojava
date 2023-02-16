FROM openjdk:8-jdk-oraclelinux8
FROM maven

WORKDIR /app

COPY . .

RUN mvn install

WORKDIR /app/target

CMD ["java", "-jar", "demojava-1.0-SNAPSHOT-jar-with-dependencies.jar", "/app/abc.txt"]