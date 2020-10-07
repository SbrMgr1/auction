FROM maven:latest as build
COPY src /product-service/src
COPY pom.xml /product-service
RUN mvn -f /product-service/pom.xml clean package

FROM openjdk:10-jre-slim
COPY --from=build /product-service/target/userService-0.0.1-SNAPSHOT.jar /usr/local/lib/userService.jar
EXPOSE 8083
ENTRYPOINT ["java", "-jar", "/usr/local/lib/userService.jar"]