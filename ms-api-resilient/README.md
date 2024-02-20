
## Spring Cloud Official Document
- https://spring.io/projects/spring-cloud-circuitbreaker
- https://cloud.spring.io/spring-cloud-static/spring-cloud-circuitbreaker/1.0.2.RELEASE/reference/html/

## Resilience4j Official Document
- https://resilience4j.readme.io/docs/getting-started-3

## Problem
- ![img_2.png](img_2.png)

## Issue Solve by Resilience
- ![img.png](img.png)
- ![img_1.png](img_1.png)

## Circuit Breaker Pattern
- ![img_3.png](img_3.png)


## Circuit Breaker Pattern Implementation
Dependency
```shell
   <dependency>
	  <groupId>org.springframework.cloud</groupId>
	  <artifactId>spring-cloud-starter-circuitbreaker-reactor-resilience4j</artifactId>
   </dependency>
```
Implementation for Gateway Server
- ![img_4.png](img_4.png)
Implementation for MicroService 
- https://docs.spring.io/spring-cloud-openfeign/docs/current/reference/html/#spring-cloud-feign-circuitbreaker
- ![img_6.png](img_6.png)

## HTTP Timeout Configuration
https://docs.spring.io/spring-cloud-gateway/reference/spring-cloud-gateway/http-timeouts-configuration.html

## Retry Pattern
![img_8.png](img_8.png)
## Retry Pattern Implementation in gateway MS
![img_7.png](img_7.png)

## Retry Pattern for Normal MS
![img_10.png](img_10.png)
![img_9.png](img_9.png)


## After Starting all Services in Sequence 
- Start Config Server
- Start Eureka Discovery Server once config server Start
- Start Microservice once Discovery Server Start
- Start Gateway Server

## Fetch Customer Details
![img_5.png](img_5.png)
## All Requests
[Microservices.postman_collection.json](Microservices.postman_collection.json)