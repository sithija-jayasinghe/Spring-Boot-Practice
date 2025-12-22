package edu.icet.controller;

import edu.icet.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CustomerController {

    ArrayList<Customer> customers = new ArrayList<>();

    @GetMapping("/customer/name")
    public String getCustomerName() {
        return "Customer Name";
    }

    @GetMapping("/add-customer")
    public Customer getCustomer() {
        return new Customer("C001", "Sithija Jayasinghe", "harshanajayasinghe113@gmail.com", "Colombo", 5000.0);
    }

    @GetMapping("/customers/all")
    public ArrayList<Customer> getAllCustomers() {
        customers.add(new Customer("C001", "Sithija Jayasinghe", "harshanajayasinghe113@gmail.com", "Colombo", 5000.0));
        customers.add(new Customer("C002", "John Doe", "johndoe@example", "New York", 3000.0));
        customers.add(new Customer("C003", "Jane Smith", "janesmith@example", "Los Angeles", 4500.0));
        return customers;
    }
}
