H2 DB
Open in browser
 http://localhost:8080/h2-console/
 
Swagger-UI
	http://localhost:8080/swagger-ui/index.html

learning :  https://spring.io/microservices



**Externalize Properties using Cloud Config**

![img.png](img.png)

**Read Configration file from class Path**
spring:
  profiles:
    active: native

**From which Location read config properties**
cloud:
 config:
  server:
   native:
     search-location:"classpath:/config"


Read Properties form Config Server
1. Add Dependency
   <dependency>
      <groupId>org.springframework.cloud</groupId>
      <artifactId>spring-cloud-starter-config</artifactId>
   </dependency>
   <DependencyManagement> ... <dependencyManagemnt>
2. Yml : Import configrtion files from config server
   config:
      import: "optional:configserver:http://localhost:8071/"



