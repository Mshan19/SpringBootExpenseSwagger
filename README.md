# Expense Application Using Spring Boot and api documentation with Swagger

This application is a documentation for my expense crud operation



## Spring Boot Architecture

Before understanding the Spring Boot Architecture, we must know the different layers and classes present in it. There are four layers in Spring Boot are as follows:

* Presentation Layer
* Business Layer
* Persistence Layer
* Database Layer

<img width="491" alt="Screenshot 2022-03-09 at 2 11 20 PM" src="https://user-images.githubusercontent.com/62529404/157406184-2ea25c9f-aa64-461f-ae7e-0e41899a45ce.png">



## Spring Boot Flow Architecture

1) Spring Boot uses all the modules of Spring-like Spring MVC, Spring Data, etc. The architecture of Spring Boot is the same as the architecture of Spring MVC, except one thing: there is no need for DAO and DAOImpl classes in Spring boot.

2) Creates a data access layer and performs CRUD operation.

3) The client makes the HTTP requests (PUT or GET).

4) The request goes to the controller, and the controller maps that request and handles it. After that, it calls the service logic if required.

5) In the service layer, all the business logic performs. It performs the logic on the data that is mapped to JPA with model classes.

6)A JSP page is returned to the user if no error occurred.

<img width="613" alt="Screenshot 2022-03-09 at 2 11 00 PM" src="https://user-images.githubusercontent.com/62529404/157405421-fcdc1451-b3c3-48a0-9fb7-23a529b28e41.png">


# An Open API 3.0 based Documentation Library in Spring Boot

#### All the CRUD Request

<img width="1725" alt="Screenshot 2022-03-09 at 2 23 19 PM" src="https://user-images.githubusercontent.com/62529404/157407375-c3fd6727-2aa7-4346-9c87-3ae165527fa9.png">

##### GET request
<img width="1724" alt="Screenshot 2022-03-09 at 2 23 49 PM" src="https://user-images.githubusercontent.com/62529404/157407396-ae76ca6f-4f0d-4104-98cb-5785c4e318fc.png">

### POST request
<img width="1448" alt="Screenshot 2022-03-09 at 2 24 55 PM" src="https://user-images.githubusercontent.com/62529404/157407406-5bad5c21-b2ec-4925-a124-66630405039d.png">
<img width="1481" alt="Screenshot 2022-03-09 at 2 25 15 PM" src="https://user-images.githubusercontent.com/62529404/157407437-a55b9336-59e1-42de-b312-74dd1defe4fc.png">

#### PUT request
<img width="1725" alt="Screenshot 2022-03-09 at 2 30 03 PM" src="https://user-images.githubusercontent.com/62529404/157408298-2e54e6ab-6623-41e2-9659-aaad8a474b84.png">
<img width="1726" alt="Screenshot 2022-03-09 at 2 30 13 PM" src="https://user-images.githubusercontent.com/62529404/157408308-55a09886-f1f3-4229-a0de-d1bcc5ab8f7d.png">

