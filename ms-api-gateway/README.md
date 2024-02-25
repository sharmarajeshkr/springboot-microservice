
## Spring Cloud Official Document
- https://docs.spring.io/spring-cloud-gateway/reference/index.html


## API Gateway Some tasks
- ![img.png](img.png)

## Steps to create Spring Cloud Gateway 
- ![img_1.png](img_1.png)

## After Starting all Services in Sequence 
- Start Config Server
- Start Discovery Server once config server Start
- Start Microservice once Discovery Server Start
- Start Gateway Server
- ![img_2.png](img_2.png)

## Request
- - Currently, we are sending request with Capital Letter (ACCOUNTS, LOANS, CARDS) : Reason is MS Name
- ![img_4.png](img_4.png)
- ![img_3.png](img_3.png)
- - If we try sending with lower character
- ![img_5.png](img_5.png)

- Fix for above
```shell
    cloud.gateway.discovery.locator.lowerCaseServiceId =  true
```
            
- ![img_6.png](img_6.png)


## Custom Filters
 - Requirement
 - - Generate Trace Id when a new request come to my gateway server and what all Micro servicesthat will track on individual Request which are all Microservice invoked
 - - Basically to track flow and if any exception occur

 - **Solution** 
 - Create Global filter
   ![img_7.png](img_7.png)


## Steps

- Start DB. If Docker is used for MYSQLDB
```sh
docker run -p 3306:3306 --name accountsdb -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=accountsdb -d mysql
docker run -p 3307:3306 --name loansdb -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=loansdb -d mysql
docker run -p 3308:3306 --name cardsdb -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=cardsdb -d mysql
```


- Start Config Server
- Start Eureka Discovery Server once config server Start
- Start Microservice once Discovery Server Start
- Start Gateway Server

## All Requests
[Microservices.postman_collection.json](Microservices.postman_collection.json)