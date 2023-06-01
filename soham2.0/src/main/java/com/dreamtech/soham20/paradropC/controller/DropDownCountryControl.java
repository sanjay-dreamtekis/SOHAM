package com.dreamtech.soham20.paradropC.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dreamtech.soham20.paradropC.repository.DropDownCountryRepo;

@RestController
public class DropDownCountryControl {
	
	@Autowired
	private DropDownCountryRepo repo;
	

	public List<String> dropdownCountry() throws IOException{
		
		List<String> country=repo.findCountryNames();
		
		return country;
	}
	
	
	

}
