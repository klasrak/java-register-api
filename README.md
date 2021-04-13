# Java Register API

> Basic CRUD to register people on DB

## Instructions

- Install [Docker](https://docs.docker.com/engine/install/) and [docker-compose](https://docs.docker.com/compose/install/);
- In your terminal, run `docker-compose up`;
- Wait until all containers are ready;

You will know that the API will be ready to receive requests when you see something like this:

```
postgres |
postgres | PostgreSQL Database directory appears to contain a database; Skipping initialization
postgres |
postgres | 2021-04-13 05:03:08.545 UTC [1] LOG:  starting PostgreSQL 13.2 (Debian 13.2-1.pgdg100+1) on x86_64-pc-linux-gnu, compiled by gcc (Debian 8.3.0-6) 8.3.0, 64-bit
postgres | 2021-04-13 05:03:08.545 UTC [1] LOG:  listening on IPv4 address "0.0.0.0", port 5432
postgres | 2021-04-13 05:03:08.545 UTC [1] LOG:  listening on IPv6 address "::", port 5432
postgres | 2021-04-13 05:03:08.548 UTC [1] LOG:  listening on Unix socket "/var/run/postgresql/.s.PGSQL.5432"
postgres | 2021-04-13 05:03:08.552 UTC [26] LOG:  database system was shut down at 2021-04-13 04:59:37 UTC
postgres | 2021-04-13 05:03:08.554 UTC [1] LOG:  database system is ready to accept connections
java-register-api |
java-register-api |   .   ____          _            __ _ _
java-register-api |  /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
java-register-api | ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
java-register-api |  \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
java-register-api |   '  |____| .__|_| |_|_| |_\__, | / / / /
java-register-api |  =========|_|==============|___/=/_/_/_/
java-register-api |  :: Spring Boot ::                (v2.4.4)
java-register-api |
java-register-api | 2021-04-13 05:03:09.382  INFO 1 --- [           main] b.c.k.j.JavaRegisterApiApplication       : Starting JavaRegisterApiApplication v0.0.1-SNAPSHOT using Java 11.0.10 on 1e78e74e44cf with PID 1 (/application.jar started by root in /)
java-register-api | 2021-04-13 05:03:09.384  INFO 1 --- [           main] b.c.k.j.JavaRegisterApiApplication       : The following profiles are active: default
java-register-api | 2021-04-13 05:03:09.804  INFO 1 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
java-register-api | 2021-04-13 05:03:09.837  INFO 1 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 27 ms. Found 1 JPA repository interfaces.
java-register-api | 2021-04-13 05:03:10.226  INFO 1 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 9000 (http)
java-register-api | 2021-04-13 05:03:10.234  INFO 1 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
java-register-api | 2021-04-13 05:03:10.234  INFO 1 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.44]
java-register-api | 2021-04-13 05:03:10.266  INFO 1 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
java-register-api | 2021-04-13 05:03:10.266  INFO 1 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 849 ms
java-register-api | 2021-04-13 05:03:10.389  INFO 1 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
java-register-api | 2021-04-13 05:03:10.417  INFO 1 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 5.4.29.Final
java-register-api | 2021-04-13 05:03:10.491  INFO 1 --- [           main] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
java-register-api | 2021-04-13 05:03:10.549  INFO 1 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
java-register-api | 2021-04-13 05:03:10.620  INFO 1 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
java-register-api | 2021-04-13 05:03:10.631  INFO 1 --- [           main] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.PostgreSQL9Dialect
java-register-api | Hibernate: alter table person add column created_at timestamp
java-register-api | Hibernate: alter table person add column updated_at timestamp
java-register-api | 2021-04-13 05:03:10.973  INFO 1 --- [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
java-register-api | 2021-04-13 05:03:10.979  INFO 1 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
java-register-api | 2021-04-13 05:03:11.009  WARN 1 --- [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
java-register-api | 2021-04-13 05:03:11.327  INFO 1 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
java-register-api | 2021-04-13 05:03:11.535  INFO 1 --- [           main] o.s.s.web.DefaultSecurityFilterChain     : Will secure any request with [org.springframework.security.web.context.request.async.WebAsyncManagerIntegrationFilter@455c1d8c, org.springframework.security.web.context.SecurityContextPersistenceFilter@4c6007fb, org.springframework.security.web.header.HeaderWriterFilter@cdb2d95, org.springframework.security.web.authentication.logout.LogoutFilter@e57e5d6, org.springframework.security.web.authentication.www.BasicAuthenticationFilter@49faf066, org.springframework.security.web.savedrequest.RequestCacheAwareFilter@6981f8f3, org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestFilter@68a4dcc6, org.springframework.security.web.authentication.AnonymousAuthenticationFilter@a451491, org.springframework.security.web.session.SessionManagementFilter@80bfdc6, org.springframework.security.web.access.ExceptionTranslationFilter@a66e580, org.springframework.security.web.access.intercept.FilterSecurityInterceptor@3c87e6b7]
java-register-api | 2021-04-13 05:03:11.576  INFO 1 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 9000 (http) with context path ''
java-register-api | 2021-04-13 05:03:11.584  INFO 1 --- [           main] b.c.k.j.JavaRegisterApiApplication       : Started JavaRegisterApiApplication in 2.503 seconds (JVM running for 2.787)
java-register-api | 2021-04-13 05:07:30.243  INFO 1 --- [nio-9000-exec-2] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
java-register-api | 2021-04-13 05:07:30.243  INFO 1 --- [nio-9000-exec-2] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
java-register-api | 2021-04-13 05:07:30.244  INFO 1 --- [nio-9000-exec-2] o.s.web.servlet.DispatcherServlet        : Completed initialization in 1 ms

```

## Getting started

All routes require the user to be authenticated with basic auth:

**User**: admin <br/>
**Password**: example123

**POST** `api/persons`:

```sh
$ curl --location --request POST 'http://localhost:9000/api/persons' \
    --header 'Authorization: Basic YWRtaW46ZXhhbXBsZTEyMw==' \
    --header 'Content-Type: application/json' \
    --header 'Cookie: JSESSIONID=06D5F3D40C2CFE37A3FE6ECE40663439' \
    --data-raw '{
        "name": "Peter Frampton",
        "gender": "male",
        "email": "email@mail.com",
        "hometown": "Sao Paulo",
        "nationality": "Sao Paulo",
        "birthDate": "07/07/1993",
        "cpf": "123.456.789-11"
    }'
```

Response:

```json
{
  "id": 2,
  "name": "Peter Frampton",
  "gender": "male",
  "email": "email@mail.com",
  "birthDate": "07/07/1993",
  "hometown": "Sao Paulo",
  "nationality": "Sao Paulo",
  "cpf": "123.456.789-11",
  "createdAt": "2021-04-13T05:55:39.557225",
  "updatedAt": "2021-04-13T05:55:39.557234"
}
```

**GET** `/api/persons`:

```sh
$ curl --location --request GET 'http://localhost:9000/api/persons' \
    --header 'Authorization: Basic YWRtaW46ZXhhbXBsZTEyMw==' \
    --header 'Cookie: JSESSIONID=06D5F3D40C2CFE37A3FE6ECE40663439' \
    --data-raw ''
```

Response:

```json
[
  {
    "id": 1,
    "name": "John Doe",
    "gender": "male",
    "email": "email2@mail.com",
    "birthDate": "07/07/1993",
    "hometown": "Sao Paulo",
    "nationality": "Sao Paulo",
    "cpf": "123.456.789-11",
    "createdAt": "2021-04-13T05:55:23.255991",
    "updatedAt": "2021-04-13T05:55:23.256013"
  },
  {
    "id": 2,
    "name": "Peter Frampton",
    "gender": "male",
    "email": "email@mail.com",
    "birthDate": "07/07/1993",
    "hometown": "Sao Paulo",
    "nationality": "Sao Paulo",
    "cpf": "123.456.789-11",
    "createdAt": "2021-04-13T05:55:39.557225",
    "updatedAt": "2021-04-13T05:55:39.557234"
  }
]
```

**GET** `/api/persons/{id}`:

```sh
$ curl --location --request GET 'http://localhost:9000/api/persons/1' \
    --header 'Authorization: Basic YWRtaW46ZXhhbXBsZTEyMw==' \
    --header 'Cookie: JSESSIONID=06D5F3D40C2CFE37A3FE6ECE40663439'
```

Response:

```json
{
  "id": 1,
  "name": "John Doe",
  "gender": "male",
  "email": "email2@mail.com",
  "birthDate": "07/07/1993",
  "hometown": "Sao Paulo",
  "nationality": "Sao Paulo",
  "cpf": "123.456.789-11",
  "createdAt": "2021-04-13T05:55:23.255991",
  "updatedAt": "2021-04-13T05:55:23.256013"
}
```

**PUT** `/api/persons/{id}`:

```sh
$ curl --location --request PUT 'http://localhost:9000/api/persons/2' \
    --header 'Authorization: Basic YWRtaW46ZXhhbXBsZTEyMw==' \
    --header 'Content-Type: application/json' \
    --header 'Cookie: JSESSIONID=06D5F3D40C2CFE37A3FE6ECE40663439' \
    --data-raw '{
        "name": "Catalina DeMolay",
        "gender": "female",
        "email": "cat@mail.com",
        "hometown": "Rio de Janeiro"
    }'
```

Response:

```json
{
  "id": 2,
  "name": "Catalina DeMolay",
  "gender": "female",
  "email": "cat@mail.com",
  "birthDate": "07/07/1993",
  "hometown": "Rio de Janeiro",
  "nationality": "Sao Paulo",
  "cpf": "123.456.789-11",
  "createdAt": "2021-04-13T05:55:39.557225",
  "updatedAt": "2021-04-13T06:02:08.490184"
}
```

**DELETE** `/api/persons/{id}`:

```sh
$ curl --location --request DELETE 'http://localhost:9000/api/persons/2' \
    --header 'Authorization: Basic YWRtaW46ZXhhbXBsZTEyMw==' \
    --header 'Cookie: JSESSIONID=06D5F3D40C2CFE37A3FE6ECE40663439'
```

Response:

```
Person with ID 2 is deleted
```

**GET** `/api/source`:

```sh
$ curl --location --request GET 'http://localhost:9000/api/source' \
    --header 'Authorization: Basic YWRtaW46ZXhhbXBsZTEyMw==' \
    --header 'Cookie: JSESSIONID=06D5F3D40C2CFE37A3FE6ECE40663439'
```

Response:

```
https://github.com/klasrak/java-register-api
```

## How it works

**Folder structure:**

```sh
.
├── docker-compose.yml
├── Dockerfile
├── HELP.md
├── java-register-api.iml
├── java-register-api.postman_collection.json
├── LICENSE
├── mvnw
├── mvnw.cmd
├── pom.xml
├── README.md
├── src
│   ├── main
│   │   ├── java
│   │   │   └── br
│   │   │       └── com
│   │   │           └── klasrak
│   │   │               └── javaregisterapi
│   │   │                   ├── config
│   │   │                   │   └── SecurityConfig.java
│   │   │                   ├── controller
│   │   │                   │   ├── PersonController.java
│   │   │                   │   └── SourceController.java
│   │   │                   ├── exceptions
│   │   │                   │   └── PersonNotFoundException.java
│   │   │                   ├── JavaRegisterApiApplication.java
│   │   │                   ├── models
│   │   │                   │   └── Person.java
│   │   │                   ├── repository
│   │   │                   │   └── PersonRepository.java
│   │   │                   └── services
│   │   │                       ├── IPerson.java
│   │   │                       └── PersonService.java
│   │   └── resources
│   │       ├── application.properties
│   │       ├── static
│   │       └── templates
│   └── test
│       └── java
│           └── br
│               └── com
│                   └── klasrak
│                       └── javaregisterapi
│                           └── JavaRegisterApiApplicationTests.java
└── target
    ├── classes
    │   ├── application.properties
    │   └── br
    │       └── com
    │           └── klasrak
    │               └── javaregisterapi
    │                   ├── config
    │                   │   └── SecurityConfig.class
    │                   ├── controller
    │                   │   ├── PersonController.class
    │                   │   └── SourceController.class
    │                   ├── exceptions
    │                   │   └── PersonNotFoundException.class
    │                   ├── JavaRegisterApiApplication.class
    │                   ├── models
    │                   │   └── Person.class
    │                   ├── repository
    │                   │   └── PersonRepository.class
    │                   └── services
    │                       ├── IPerson.class
    │                       └── PersonService.class
    ├── generated-sources
    │   └── annotations
    ├── generated-test-sources
    │   └── test-annotations
    ├── java-register-api-0.0.1-SNAPSHOT.jar
    ├── java-register-api-0.0.1-SNAPSHOT.jar.original
    ├── maven-archiver
    │   └── pom.properties
    ├── maven-status
    │   └── maven-compiler-plugin
    │       ├── compile
    │       │   └── default-compile
    │       │       ├── createdFiles.lst
    │       │       └── inputFiles.lst
    │       └── testCompile
    │           └── default-testCompile
    │               ├── createdFiles.lst
    │               └── inputFiles.lst
    └── test-classes
        └── br
            └── com
                └── klasrak
                    └── javaregisterapi
                        └── JavaRegisterApiApplicationTests.class


```

## Purpose of the project

This project was (and will continue to be) developed for the purpose of studies. Any feedback or contribution, positive or not, will be very welcome and will be taken into consideration.

## License

This project follows [MIT License](https://github.com/klasrak/java-register-api/blob/master/LICENSE).
