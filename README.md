# SpringBootExpenseSwagger
This application is a documentation for my expense crud operation

## Spring Boot Flow Architecture
1) Spring Boot uses all the modules of Spring-like Spring MVC, Spring Data, etc. The architecture of Spring Boot is the same as the architecture of Spring MVC, except one thing: there is no need for DAO and DAOImpl classes in Spring boot.
2) Creates a data access layer and performs CRUD operation.
3) The client makes the HTTP requests (PUT or GET).
4) The request goes to the controller, and the controller maps that request and handles it. After that, it calls the service logic if required.
5) In the service layer, all the business logic performs. It performs the logic on the data that is mapped to JPA with model classes.
6)A JSP page is returned to the user if no error occurred.

