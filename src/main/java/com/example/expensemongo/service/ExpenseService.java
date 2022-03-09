package com.example.expensemongo.service;

import com.example.expensemongo.model.Expense;
import com.example.expensemongo.repository.ExpenseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
//@Service annotation is used with classes that provide some business functionalities
@Service

@Transactional
//in order to perform crud operation we need expenserepository -to autowire
public class ExpenseService {

    private final ExpenseRepository expenseRepository;

    public ExpenseService(ExpenseRepository expenseRepository){
        this.expenseRepository=expenseRepository;
    }

    public void addExpense(Expense expense){expenseRepository.insert(expense);}
    public void updateExpense(Expense expense){
        Expense savedExpense=expenseRepository.findById(expense.getId()).orElseThrow(()->new RuntimeException(String.format("Cannot find Expense by ID %s",expense.getId())));

        savedExpense.setExpenseName(expense.getExpenseName());
        savedExpense.setExpenseCategory(expense.getExpenseCategory());
        savedExpense.setExpenseAmount(expense.getExpenseAmount());

        expenseRepository.save(expense);

    }
    public List<Expense> getAllExpenses(){ return expenseRepository.findAll();}
    public void getExpenseByName(String name){
        expenseRepository.findByName(name).orElseThrow(()-> new RuntimeException(
                String.format("Cannot Find Expense by Name %s",name)
        ));
    }
    public void deleteExpense(String id){
        expenseRepository.deleteById(id);
    }
}
