# SpringBootExpenseSwagger

This application is a documentation for my expense crud operation

## Spring Boot Architecture

Before understanding the Spring Boot Architecture, we must know the different layers and classes present in it. There are four layers in Spring Boot are as follows:

* Presentation Layer
* Business Layer
* Persistence Layer
* Database Layer


## Spring Boot Flow Architecture

1) Spring Boot uses all the modules of Spring-like Spring MVC, Spring Data, etc. The architecture of Spring Boot is the same as the architecture of Spring MVC, except one thing: there is no need for DAO and DAOImpl classes in Spring boot.

2) Creates a data access layer and performs CRUD operation.

3) The client makes the HTTP requests (PUT or GET).

4) The request goes to the controller, and the controller maps that request and handles it. After that, it calls the service logic if required.

5) In the service layer, all the business logic performs. It performs the logic on the data that is mapped to JPA with model classes.

6)A JSP page is returned to the user if no error occurred.

<img width="613" alt="Screenshot 2022-03-09 at 2 11 00 PM" src="https://user-images.githubusercontent.com/62529404/157405421-fcdc1451-b3c3-48a0-9fb7-23a529b28e41.png">




