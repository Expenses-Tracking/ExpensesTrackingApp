package com.ExpensesTrackingApp;

import com.ExpensesTrackingApp.Repository.CategoryRepository;
import com.ExpensesTrackingApp.Repository.ExpenseRepository;
import com.ExpensesTrackingApp.Repository.UserRepository;
import com.ExpensesTrackingApp.models.Category;
import com.ExpensesTrackingApp.models.Customer;
import com.ExpensesTrackingApp.models.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@EnableAutoConfiguration
public class ExpensesTrackingAppApplication{
	@Autowired
	UserRepository userRepository;
	CategoryRepository categoryRepository;
	ExpenseRepository expenseRepository;
	public static void main(String[] args) {
		SpringApplication.run(ExpensesTrackingAppApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(){
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {

				Customer customer1 = new Customer();
				customer1.setEmail("kate@gmail.com");
				customer1.setUsername("Kate Uphill");
				userRepository.save(customer1);

				Customer customer2 = new Customer();
				customer2.setEmail("late@gmail.com");
				customer2.setUsername("Late Timing");
				userRepository.save(customer2);

//				Category category1 = new Category();
//				category1.setDescription("Food");
//				categoryRepository.save(category1);
//
//				Category category2 = new Category();
//				category2.setDescription("Fuel");
//				categoryRepository.save(category2);
//
//				Category category3 = new Category();
//				category3.setDescription("Accommodation");
//				categoryRepository.save(category3);
//
//				Expense expense1 = new Expense();
//				expense1.setAmount(35.48F);
//				expense1.setNote("Team Lunch");
//				expense1.setStatus(false);
//				expense1.setCategory(category1);
//				expense1.setCustomer(customer);
//				expenseRepository.save(expense1);
//
//				Expense expense2 = new Expense();
//				expense2.setAmount(100.78F);
//				expense2.setNote("Conference");
//				expense2.setStatus(false);
//				expense2.setCategory(category3);
//				expense2.setCustomer(customer1);
//				expenseRepository.save(expense2);
//
//				Expense expense3 = new Expense();
//				expense3.setAmount(75.0F);
//				expense3.setNote("Branch Visit");
//				expense3.setStatus(true);
//				expense3.setCategory(category2);
//				expense3.setCustomer(customer);
//				expenseRepository.save(expense3);
			}
		};
	}

}
