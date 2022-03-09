package com.example.expensemongo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @SpringBootApplication ->
 * 1) This single annotation combines three annotations like @Configuration, @EnableAutoConfiguration, and @ComponentScan.
 * 2) If we use Spring Boot, then we can run your application without deploying it into a web server, as it comes with an embedded Tomcat server.
 */
@SpringBootApplication
@OpenAPIDefinition
public class ExpensemongoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExpensemongoApplication.class, args);
    }

}
