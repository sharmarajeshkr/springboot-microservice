## Discovery Server

![img.png](img.png)

![img_1.png](img_1.png)

## Problem's we will solve using Discovery Server

![img_3.png](img_3.png)

## Solution

![img_4.png](img_4.png)

## Load Balancer

![img_5.png](img_5.png)

## Terminology Used

![img_6.png](img_6.png)

## Spring Cloud Support for Client-side Service Discovery
![img_7.png](img_7.png)

## Steps

- Start DB. If Docker is used for MYSQLDB
```sh
docker run -p 3307:3306 --name accountsdb -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=accountsdb -d mysql
docker run -p 3308:3306 --name loansdb -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=loansdb -d mysql
docker run -p 3309:3306 --name cardsdb -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=cardsdb -d mysql
```


- Start Config Server
- Start Discovery Server once config server Start--> Dependency
- Start Microservice once Discovery Server Start--> Dependency


