package com.dreamtech.soham20.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.dreamtech.soham20.model.Customer;
import com.dreamtech.soham20.model.CustomerKeys;
import com.dreamtech.soham20.service.CustomerService;

import java.util.List;

@RestController
@RequestMapping("/customers")
@CrossOrigin(origins = "http://localhost:3000")
public class CustomerController {

	@Autowired
    private  CustomerService customerService;
	

   
 // Post Request
    @PostMapping("/add")
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        Customer createdCustomer = customerService.createCustomer(customer);
        return new ResponseEntity<>(createdCustomer, HttpStatus.CREATED);
    }

 // Get all 
    @GetMapping ("/getAll")
    public ResponseEntity<List<Customer>> getAllCustomers() {
        List<Customer> customers = customerService.getAllCustomers();
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }

// Get Request
    @GetMapping("/{clientId}/{customerCode}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable("clientId") String clientId ,@PathVariable("customerCode") String customerCode) {
    	Customer customer = customerService.getCustomerById(clientId, customerCode);
        if (customer != null) {
            return new ResponseEntity<>(customer, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

// Update Request
    @PutMapping("/{clientId}/{customerCode}")
    public ResponseEntity<Customer> updateCustomer(
            @PathVariable("clientId") String clientId,
            @PathVariable("customerCode") String customerCode,
            @RequestBody Customer customer) {
    	Customer updateCustomer = customerService.getCustomerByIdAndCode(clientId, customerCode);
        if (customer != null && updateCustomer !=null) {	
            Customer savedCustomer = customerService.updateCustomer(updateCustomer,customer);
             if(savedCustomer !=null)    {
        	 return new ResponseEntity<>(savedCustomer, HttpStatus.OK);
             } else {
              return new ResponseEntity<>(HttpStatus.NOT_FOUND);
              }
            
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
//Delete Request
    @DeleteMapping("/{clientId}/{customerCode}")
    public void deleteCustomer(
            @PathVariable("clientId") String clientId,
            @PathVariable("customerCode") String customerCode) {
    	customerService.deleteCust(clientId, customerCode);
    }

    
}
