package com.dreamtech.soham20.paramdrop.controller;


import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.dreamtech.soham20.paradropC.controller.DropDownCountryControl;
import com.dreamtech.soham20.paradropC.model.DropDownCountryModel;
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
	public List<DropListModel> customerAll()
	{
	   List<DropListModel> customer=dropSer.getDropdown();
		return customer;
	}
	@GetMapping("/all/{fieldName}")
	public List<DropListModel> details(@PathVariable("fieldName") String filedName)
	{
		List<DropListModel> customer=dropSer.getDrop(filedName);
		return customer;
		
		
	}
	@RequestMapping("/customer") 
	public List<DropListModel> customer()
	{
		List<DropListModel> customer=dropSer.getDrop("CUSTOMERTYPE");
		return customer;
	}
	/*@RequestMapping("/customer") 
	public List<DropListModel> customer()
	{
		List<DropListModel> customer=dropSer.getDrop("CUSTOMERTYPE");
		return customer;
	}*/
	
	@RequestMapping("/status") 
	public List<DropListModel> status()
	{
		List<DropListModel> status=dropSer.getDrop("ISACTIVE");
		return status;
	}
	
	@RequestMapping("/Gender") 
	public List<DropListModel> Gender()
	{
		List<DropListModel> values=dropSer.getDrop("GENDER");

		return values;
	}
	
	
	@RequestMapping("/maritalStatus") 
	public List<DropListModel> maragelStatus()
	{
		List<DropListModel> values=dropSer.getDrop("MARITALSTATUS");
		return values;
	}
	
	@RequestMapping("/IDtype") 
	public List<DropListModel> IDtype()
	{
		List<DropListModel> values=dropSer.getDrop("IDTYPE");
		return values;
	}
	
	@RequestMapping("/typeOfBusiness") 
	public List<DropListModel> typeOfBusiness()
	{
		List<DropListModel> values=dropSer.getDrop("TYPEOFBUSE");
		return values;
	}
	
	@RequestMapping("/typeOfIndustry") 
	public List<DropListModel> typeOfIndustry()
	{
		List<DropListModel> values=dropSer.getDrop("TYPEOFINDUSTRY");

		return values;
	}
	
	@RequestMapping("/district") 
	public List<DropListModel> district()
	{
		List<DropListModel> values=dropSer.getDrop("CITY");
		return values;
	}
	
	@RequestMapping("/title") 
	public List<DropListModel> title()
	{
		List<DropListModel> values=dropSer.getDrop("TITLE");
		return values;
	}
	
	
	@RequestMapping("/BankAccountType") 
	public List<DropListModel> BankAccountType()
	{
		List<DropListModel> values=dropSer.getDrop("ACCOUNTTYPE");
		return values;
	}
	@RequestMapping("/BankName") 
	public List<DropListModel> BankName()
	{
		List<DropListModel> values=dropSer.getDrop("BANKNAME");
		return values;
	}
	
	@RequestMapping("/NationalID") 
	public List<String> nationalID()
	{
		List<String> values=custSer.getNationalId();
		
		return values;
	}
	
	@RequestMapping("/country") 
	public List<DropDownCountryModel> country() throws IOException
	{
		List<DropDownCountryModel> values=DropDCont.dropdownCountry();
		return values;
		
	}
}
