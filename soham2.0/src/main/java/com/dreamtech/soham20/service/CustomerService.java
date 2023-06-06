package com.dreamtech.soham20.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dreamtech.soham20.Repository.CustomerRepository;
import com.dreamtech.soham20.Repository.SlaCustCommRepository;
import com.dreamtech.soham20.model.Customer;
import com.dreamtech.soham20.model.CustomerKeys;
import com.dreamtech.soham20.model.SlaCustCommId;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
	
    @Autowired
    private  CustomerRepository customerRepository;

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

    public Customer getCustomerById(String clientId ,String customerCode) {
    
    Customer customer= customerRepository.findById(new CustomerKeys(clientId,customerCode)).get();
        	    return customer;
        }

    
    
    public Customer updateCustomer(Customer updateCustomer ,Customer customer) {
    	
    	
    	if(updateCustomer.getClientId().equals(customer.getClientId()) && updateCustomer.getCustomerCode().equals(customer.getCustomerCode()))
    	{
    		updateCustomer.setClientId(customer.getClientId());
        	updateCustomer.setCustomerCode(customer.getCustomerCode());
        	updateCustomer.setCustomerName(customer.getCustomerName());
        	updateCustomer.setStartDate(customer.getStartDate());
        	updateCustomer.setIsActive(customer.getIsActive());
        	updateCustomer.setCustomerType(customer.getCustomerType());
        	updateCustomer.setLocation(customer.getLocation());
        	updateCustomer.setCompanyName(customer.getCompanyName());
        	updateCustomer.setAddress1(customer.getAddress1());
        	updateCustomer.setAddress2(customer.getAddress2());
        	updateCustomer.setCountry(customer.getCountry());
        	updateCustomer.setState(customer.getState());
        	updateCustomer.setCity(customer.getCity());
        	updateCustomer.setPostal(customer.getPostal());
        	updateCustomer.setAddress1Perm(customer.getAddress1Perm());
        	updateCustomer.setAddress2Perm(customer.getAddress2Perm());
        	updateCustomer.setCountryPerm(customer.getCountryPerm());
        	updateCustomer.setStatePerm(customer.getStatePerm());
        	updateCustomer.setCityPerm(customer.getCityPerm());
        	updateCustomer.setPostalPerm(customer.getPostalPerm());
        	updateCustomer.setBusinessType(customer.getBusinessType());
        	updateCustomer.setTitle(customer.getTitle());
        	updateCustomer.setFirstName(customer.getFirstName());
        	updateCustomer.setMiddleName(customer.getMiddleName());
        	updateCustomer.setLastName(customer.getLastName());
        	updateCustomer.setGender(customer.getGender());
        	updateCustomer.setDateOfBirth(customer.getDateOfBirth());
        	updateCustomer.setFatherName(customer.getFatherName());
        	updateCustomer.setGrandfatherName(customer.getGrandfatherName());
        	updateCustomer.setMaritalStatus(customer.getMaritalStatus());
        	updateCustomer.setOccupation(customer.getOccupation());
        	updateCustomer.setIndustryType(customer.getIndustryType());
        	updateCustomer.setNationalId(customer.getNationalId());
        	updateCustomer.setOtherIdType(customer.getOtherIdType());
        	updateCustomer.setOtherIdDescription(customer.getOtherIdDescription());
        	updateCustomer.setAccountType(customer.getAccountType());
        	updateCustomer.setAccountNumber(customer.getAccountNumber());
        	updateCustomer.setPayeeName(customer.getPayeeName());
        	updateCustomer.setBankName(customer.getBankName());
        	updateCustomer.setBranchName(customer.getBranchName());
        	updateCustomer.setBranchAddress(customer.getBranchAddress());
        	updateCustomer.setMicrNumber(customer.getMicrNumber());
        	updateCustomer.setComments(customer.getComments());
        	updateCustomer.setCreatedBy(customer.getCreatedBy());
        	updateCustomer.setCreatedOn(customer.getCreatedOn());
        	updateCustomer.setAuditAction(customer.getAuditAction());
        	updateCustomer.setAuditDateTime(customer.getAuditDateTime());
        	updateCustomer.setUserId(customer.getUserId());

    		
    		return customerRepository.save(updateCustomer);
    	}
    	
    	return null;
    	
        
    }

    public void deleteCust(String clientId, String customerCode) {
    	customerRepository.deleteById(new CustomerKeys(clientId, customerCode));
    }
    
    public List<String> getNationalId()
    {
    	return customerRepository.findBySearchingNationalID(); 
    }

	public Customer getCustomerByIdAndCode(String clientId, String customerCode) {
		    
		 
				Customer cust =customerRepository.findById(new CustomerKeys(clientId,customerCode)).orElse(null);
				return cust;
	}
}

