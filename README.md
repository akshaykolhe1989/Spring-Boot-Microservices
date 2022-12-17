# Spring-Boot-Microservices
Microservices with Spring Boot + Spring Cloud

#### _How to run the application ?_
###### To build all the projects
./gradle-all.sh
###### To run the config-service and discovery-service
./pre-work.sh
###### To run the all other services
docker-compose -f docker-compose.yaml up

#### Services Available on port
| Service | URL |
| ------ | ------ |
| discovery-service | http://localhost:5000 |
| rabbitmq server | http://localhost:15672 |


#### Below is temporary documentation of Rest APIs (End Points) - TODO: This should be Swagger open API later
| METHOD | URL | BODY |
| ------ | ------ | ------ |
| GET | http://localhost:5003/customers |-|
| GET | http://localhost:5003/orders |-|
| POST | http://localhost:5003/orders/pay | {"orderId": 101,"orderName": "Prod 1","customerId": 1} |
| POST | http://localhost:5003/orders | {"orderId": 101,"orderName": "Prod 1","customerId": 1} |