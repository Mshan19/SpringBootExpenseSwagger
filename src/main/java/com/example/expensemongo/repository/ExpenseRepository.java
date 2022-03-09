package com.example.expensemongo.repository;

import com.example.expensemongo.model.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @Repository Annotation is a specialization of @Component annotation
 * which is used to indicate that the class provides the mechanism for
 * storage, retrieval, update, delete and search operation on objects
 */
@Repository
public interface ExpenseRepository extends MongoRepository<Expense,String> {
@Query("{'name':?0}")
    Optional<Expense>findByName(String name);
}
