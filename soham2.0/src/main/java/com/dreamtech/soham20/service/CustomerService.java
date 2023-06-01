package com.dreamtech.soham20.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dreamtech.soham20.Repository.CustomerRepository;
import com.dreamtech.soham20.model.Customer;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomerById(String clientId) {
        return customerRepository.findById(clientId).orElse(null);
    }

    public Customer updateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public void deleteCustomer(String clientId) {
        customerRepository.deleteById(clientId);
    }
    
    public List<String> getNationalId()
    {
    	return customerRepository.findBySearchingNationalID(); 
    }
}

