package com.dreamtech.soham20.paramdrop.controller;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dreamtech.soham20.model.Customer;
import com.dreamtech.soham20.paradropC.controller.DropDownCountryControl;
import com.dreamtech.soham20.paramdrop.model.DropListModel;
import com.dreamtech.soham20.paramdrop.service.DropDownService;
import com.dreamtech.soham20.service.CustomerService;



@RestController
@RequestMapping("/param") 
@CrossOrigin(origins = "http://localhost:3000")
public class DropDownController {
	
	
	@Autowired
	private DropDownService dropSer;
	
	@Autowired
	private CustomerService custSer;
	
	@Autowired
	private DropDownCountryControl DropDCont;
	

	@GetMapping("/all") 
	public List<DropListModel> customer()
	{
		List<DropListModel> customer=dropSer.getDropdown();
		return customer;
	}
	/*@RequestMapping("/customer") 
	public List<String> customer()
	{
		List<String> customer=dropSer.getDropdownValues("CUSTOMERTYPE");
		return customer;
	}*/
	
	@RequestMapping("/status") 
	public List<String> status()
	{
		List<String> status=dropSer.getDropdownValues("ISACTIVE");
		return status;
	}
	
	@RequestMapping("/Gender") 
	public List<String> Gender()
	{
		List<String> values=dropSer.getDropdownValues("GENDER");

		return values;
	}
	
	
	@RequestMapping("/maritalStatus") 
	public List<String> maragelStatus()
	{
		List<String> values=dropSer.getDropdownValues("MARITALSTATUS");
		return values;
	}
	
	@RequestMapping("/IDtype") 
	public List<String> IDtype()
	{
		List<String> values=dropSer.getDropdownValues("IDTYPE");
		return values;
	}
	
	@RequestMapping("/typeOfBusiness") 
	public List<String> typeOfBusiness()
	{
		List<String> values=dropSer.getDropdownValues("TYPEOFBUSE");
		return values;
	}
	
	@RequestMapping("/typeOfIndustry") 
	public List<String> typeOfIndustry()
	{
		List<String> values=dropSer.getDropdownValues("TYPEOFINDUSTRY");

		return values;
	}
	
	@RequestMapping("/district") 
	public List<String> district()
	{
		List<String> values=dropSer.getDropdownValues("CITY");
		return values;
	}
	
	@RequestMapping("/title") 
	public List<String> title()
	{
		List<String> values=dropSer.getDropdownValues("TITLE");
		return values;
	}
	
	
	@RequestMapping("/BankAccountType") 
	public List<String> BankAccountType()
	{
		List<String> values=dropSer.getDropdownValues("ACCOUNTTYPE");
		return values;
	}
	@RequestMapping("/BankName") 
	public List<String> BankName()
	{
		List<String> values=dropSer.getDropdownValues("BANKNAME");
		return values;
	}
	
	@RequestMapping("/NationalID") 
	public List<String> nationalID()
	{
		List<String> values=custSer.getNationalId();
		
		return values;
	}
	
	@RequestMapping("/country") 
	public List<String> country() throws IOException
	{
		List<String> values=DropDCont.dropdownCountry();
		return values;
		
	}
}
