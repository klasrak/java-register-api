FROM openjdk:11 as builder

WORKDIR /usr/app

COPY . .

RUN ./mvnw clean package -DskipTests

FROM openjdk:11
COPY --from=builder /usr/app/target/*.jar application.jar
ENTRYPOINT [ "java", "-jar", "application.jar" ]
