package com.dreamtech.soham20.paradropC.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="[dbo].[SLA_COUNTRY]")
public class DropDownCountryModel {
	
	@Id
	 @Column(name = "COUNTRY", length =3)
	private String country;
	 
	 @Column(name = "NAME", length = 50)
	private String name;
	 
	 @Column(name = "COUNTRYCHAR", length = 3)
	private String countrtchar;
	
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountrtchar() {
		return countrtchar;
	}
	public void setCountrtchar(String countrtchar) {
		this.countrtchar = countrtchar;
	}
	

}
