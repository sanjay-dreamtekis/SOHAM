package com.dreamtech.soham20.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@IdClass(CustomerId.class)
@Entity
@Table(name = "SLA_CUSTOMER")
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "CLIENTID", length = 10, nullable = false)
    private String clientId;

//    @Id
    @Column(name = "CUSTOMERCODE", length = 30, nullable = false)
    private String customerCode;

    @Column(name = "CUSTOMERNAME", length = 100)
    private String customerName;

    @Column(name = "STARTDT")
    private Date startDate;

    @Column(name = "ISACTIVE", length = 1)
    private String isActive;

    @Column(name = "CUSTOMERTYPE", length = 6)
    private String customerType;

    @Column(name = "LOCATION", length = 10)
    private String location;

    @Column(name = "COMPANYNAME", length = 100)
    private String companyName;

    @Column(name = "ADDR1", length = 55)
    private String address1;

    @Column(name = "ADDR2", length = 55)
    private String address2;

    @Column(name = "COUNTRY", length = 10)
    private String country;

    @Column(name = "STATE", length = 10)
    private String state;

    @Column(name = "CITY", length = 30)
    private String city;

    @Column(name = "POSTAL", length = 30)
    private String postal;

    @Column(name = "ADDR1PERM", length = 55)
    private String address1Perm;

    @Column(name = "ADDR2PERM", length = 55)
    private String address2Perm;

    @Column(name = "COUNTRYPERM", length = 3)
    private String countryPerm;

    @Column(name = "STATEPERM", length = 6)
    private String statePerm;

    @Column(name = "CITYPERM", length = 30)
    private String cityPerm;

    @Column(name = "POSTALPERM", length = 30)
    private String postalPerm;

    @Column(name = "BUSNTYPE", length = 225)
    private String businessType;

    @Column(name = "TITLE", length = 4)
    private String title;

    @Column(name = "FIRSTNAME", length = 50)
    private String firstName;

    @Column(name = "MIDDLENAME", length = 50)
    private String middleName;

    @Column(name = "LASTNAME", length = 50)
    private String lastName;

    @Column(name = "GENDER", length = 1)
    private String gender;

    @Column(name = "DATEOFBIRTH")
    private Date dateOfBirth;

    @Column(name = "FATHERNAME", length = 50)
    private String fatherName;

    @Column(name = "GRANDFATHERNAME", length = 50)
    private String grandfatherName;

    @Column(name = "MARITALSTATUS", length = 15)
    private String maritalStatus;

    @Column(name = "OCCUPATION", length = 100)
    private String occupation;

    @Column(name = "INDUSTRYTYPE", length = 15)
    private String industryType;

    @Column(name = "NATIONID", length = 50)
    private String nationalId;

    @Column(name = "OTHIDTYPE", length = 15)
    private String otherIdType;

    @Column(name = "OTHIDDESC", length = 50)
    private String otherIdDescription;

    @Column(name = "ACCOUNTTYPE", length = 1)
    private String accountType;

    @Column(name = "ACCOUNTNUMBER", length = 25)
    private String accountNumber;

    @Column(name = "PAYEENAME", length = 50)
    private String payeeName;

    @Column(name = "BANKNAME", length = 50)
    private String bankName;

    @Column(name = "BRANCHNAME", length = 50)
    private String branchName;

    @Column(name = "BRANCHADDR", length = 50)
    private String branchAddress;

    @Column(name = "MICRNO", length = 15)
    private String micrNumber;

    @Column(name = "COMMENTS", length = 4000)
    private String comments;

    @Column(name = "CREATEDBY", length = 100)
    private String createdBy;

    @Column(name = "CREATEDON")
    private Date createdOn;

    @Column(name = "AUDITACTION", length = 1)
    private String auditAction;

    @Column(name = "AUDITDATETIME")
    private Date auditDateTime;

    @Column(name = "USERID", length = 10)
    private String userId;

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostal() {
		return postal;
	}

	public void setPostal(String postal) {
		this.postal = postal;
	}

	public String getAddress1Perm() {
		return address1Perm;
	}

	public void setAddress1Perm(String address1Perm) {
		this.address1Perm = address1Perm;
	}

	public String getAddress2Perm() {
		return address2Perm;
	}

	public void setAddress2Perm(String address2Perm) {
		this.address2Perm = address2Perm;
	}

	public String getCountryPerm() {
		return countryPerm;
	}

	public void setCountryPerm(String countryPerm) {
		this.countryPerm = countryPerm;
	}

	public String getStatePerm() {
		return statePerm;
	}

	public void setStatePerm(String statePerm) {
		this.statePerm = statePerm;
	}

	public String getCityPerm() {
		return cityPerm;
	}

	public void setCityPerm(String cityPerm) {
		this.cityPerm = cityPerm;
	}

	public String getPostalPerm() {
		return postalPerm;
	}

	public void setPostalPerm(String postalPerm) {
		this.postalPerm = postalPerm;
	}

	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getGrandfatherName() {
		return grandfatherName;
	}

	public void setGrandfatherName(String grandfatherName) {
		this.grandfatherName = grandfatherName;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getIndustryType() {
		return industryType;
	}

	public void setIndustryType(String industryType) {
		this.industryType = industryType;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	public String getOtherIdType() {
		return otherIdType;
	}

	public void setOtherIdType(String otherIdType) {
		this.otherIdType = otherIdType;
	}

	public String getOtherIdDescription() {
		return otherIdDescription;
	}

	public void setOtherIdDescription(String otherIdDescription) {
		this.otherIdDescription = otherIdDescription;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getPayeeName() {
		return payeeName;
	}

	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchAddress() {
		return branchAddress;
	}

	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}

	public String getMicrNumber() {
		return micrNumber;
	}

	public void setMicrNumber(String micrNumber) {
		this.micrNumber = micrNumber;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getAuditAction() {
		return auditAction;
	}

	public void setAuditAction(String auditAction) {
		this.auditAction = auditAction;
	}

	public Date getAuditDateTime() {
		return auditDateTime;
	}

	public void setAuditDateTime(Date auditDateTime) {
		this.auditDateTime = auditDateTime;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	}

    


