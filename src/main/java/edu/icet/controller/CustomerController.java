package edu.icet.controller;

import edu.icet.model.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
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
        return customers;
    }

    @PostMapping("/customers/add")
    public String addCustomer(@RequestBody Customer customer) {
        customers.add(customer);
        return "Customer Added";
    }
}
