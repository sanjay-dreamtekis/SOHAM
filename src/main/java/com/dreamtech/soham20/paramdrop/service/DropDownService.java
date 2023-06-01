package com.dreamtech.soham20.paramdrop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dreamtech.soham20.model.Customer;
import com.dreamtech.soham20.paramdrop.model.DropListModel;
import com.dreamtech.soham20.paramdrop.repository.dropDownRepo;

@Service
public class DropDownService {
	
	@Autowired
	private  dropDownRepo repo;
	

    public void DropdownService(dropDownRepo repo) {
        this.repo = repo;
    }
    
  

    public List<String> getDropdownValues(String name) {
    	 	
    	List<String> values=repo.findByNameFiledName(name);
    	return values;
    }
    public List<DropListModel> getDropdown() {
	 	
    	List<DropListModel> values=repo.findAll();
    	return values;
    }

}
