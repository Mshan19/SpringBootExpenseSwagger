package com.example.expensemongo.controller;

import com.example.expensemongo.model.Expense;
import com.example.expensemongo.service.ExpenseService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * In Spring Boot, the controller class is responsible for processing incoming REST API requests,
 * preparing a model, and returning the view to be rendered as a response.
 *
 * @Controller -> 1) this annotation is used to make a class as a web controller,
 * which can handle client request and send a response back to the client .
 * 2) This is a class level annotation ,which is put on top of your controller class.
 *
 * Similarly
 * @RestController
 * 1) This is a convenience annotation for developing RESTful web service with the spring MVC frame work.
 * 2)The @RestController is a combination of @Controller and @ResponseBody,
 * 3) When you annotate a controller class with @RestController it does two purposes,
 * first, it says that the controller class is handling a request for REST APIs and
 * second you don't need to annotate each method with the @ResposneBody annotation to signal that the
 *response will be converted into a Resource using various HttpMessageConverers.
 *
 * @Request Mapping ->t is used to map web requests onto specific handler classes and/or handler methods.
 */
@RestController
@RequestMapping("/api/expense")
public class ExpenseController {

       private final ExpenseService expenseService;
       public ExpenseController(ExpenseService expenseService){
           this.expenseService=expenseService;
       }


       //this is for documenting api  using swagger
    @Operation(summary ="This is to add a new Expense Record in the database" )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201",
                    description = "  Successfully added the new expense record in the database ",
                    content = {@Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "404",
                    description = " Oops error :( Please check your json document ",
                    content = @Content)
    })

       @PostMapping("/add")
       public ResponseEntity addExpense(@RequestBody Expense expense){
           expenseService.addExpense(expense);
           return ResponseEntity.status(HttpStatus.CREATED).build();
       }



    @Operation(summary ="This is to update an existing Expense Record in the database" )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "  the record has been updated :) ",
                    content = {@Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "404",
                    description = " Oops error :( Please check your json document ",
                    content = @Content)
    })

    @PutMapping("/update")
    public ResponseEntity updateExpense(@RequestBody Expense expense){
           expenseService.updateExpense(expense);
           return ResponseEntity.ok().build();
    }



    @Operation(summary ="This is to fetch all the expenses stored in the db" )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "  Fetched All the expense record stored in the database ",
                    content = {@Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "404",
                    description = "Not Available",
                    content = @Content)
    })

    @GetMapping("/getall")
    public ResponseEntity<List<Expense>> getAllExpenses(){return ResponseEntity.ok(expenseService.getAllExpenses());}



    @Operation(summary ="  This is to delete the expense record which is of no use now " )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204",
                    description = "    Deleted the record with the respective id",
                    content = {@Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "404",
                    description = "This id doesn't exist in the database",
                    content = @Content)
    })

    @DeleteMapping(value = "/{id}",produces = "application/json")
    public ResponseEntity deleteExpense(String id){
           expenseService.deleteExpense(id);
           return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
