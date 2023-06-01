package com.dreamtech.soham20.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.dreamtech.soham20.model.Customer;
import com.dreamtech.soham20.service.CustomerService;

import java.util.List;

@RestController
@RequestMapping("/customers")
@CrossOrigin(origins = "http://localhost:3000")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    // Create a new customer
    @PostMapping("/add")
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        Customer createdCustomer = customerService.createCustomer(customer);
        return new ResponseEntity<>(createdCustomer, HttpStatus.CREATED);
    }

    // Get all customers
    @GetMapping ("/getAll")
    public ResponseEntity<List<Customer>> getAllCustomers() {
        List<Customer> customers = customerService.getAllCustomers();
        System.out.println("ALLL"+ customers);
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }

    // Get a customer by ID
    @GetMapping("/{clientId}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable("clientId") String clientId) {
        Customer customer = customerService.getCustomerById(clientId);
        if (customer != null) {
            return new ResponseEntity<>(customer, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Update a customer
    @PutMapping("/{clientId}/{customerCode}")
    public ResponseEntity<Customer> updateCustomer(
            @PathVariable("clientId") String clientId,
            @RequestBody Customer updatedCustomer) {
        Customer customer = customerService.getCustomerById(clientId);
        if (customer != null) {
            Customer savedCustomer = customerService.updateCustomer(updatedCustomer);
            return new ResponseEntity<>(savedCustomer, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Delete a customer
    @DeleteMapping("/{clientId}/{customerCode}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable("clientId") String clientId) {
        Customer customer = customerService.getCustomerById(clientId);
        if (customer != null) {
            customerService.deleteCustomer(clientId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
