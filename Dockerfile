
FROM openjdk:11
ADD ./target/spring-boot-neo4j-0.0.1-SNAPSHOT.jar /spring-boot-neo4j/src/spring-boot-neo4j-0.0.1-SNAPSHOT.jar
WORKDIR spring-boot-neo4j/src
EXPOSE 8060
ENTRYPOINT ["java","-jar","spring-boot-neo4j-0.0.1-SNAPSHOT.jar"]

