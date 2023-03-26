package com.ExpensesTrackingApp.Service;

import com.ExpensesTrackingApp.Repository.ExpenseRepository;
import com.ExpensesTrackingApp.Repository.UserRepository;
import com.ExpensesTrackingApp.models.Customer;
import com.ExpensesTrackingApp.models.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CustomerService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    ExpenseRepository expenseRepository;

    //getting all customers records
    public List<Customer> getAllCustomer()
    {
       return userRepository.findAll();
    }

    //getting a specific record
    public Customer getCustomerById(Long id){
        return userRepository.findById(id).get();
    }
    //Creating a new customer
    public Customer createCustomer(Customer customer){
        Customer _customer = userRepository.save(new Customer(customer.getEmail(), customer.getUsername()));
        return _customer;
    }
    //deleting a specific record
    public void deleteById(Long id){
        userRepository.deleteById(id);
    }

}