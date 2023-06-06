package com.dreamtech.soham20.model;
import java.io.Serializable;

public class CustomerKeys implements Serializable{
	 private static final long serialVersionUID = 1L;

	 private	String clientId;
	private	String customerCode;
	
   public CustomerKeys() {
		
	}
	
	public CustomerKeys(String clientId, String customerCode) {
		super();
		this.clientId = clientId;
		this.customerCode = customerCode;
	}

	public String getclientId() {
		return clientId;
	}


	public void setclientId(String clientId) {
		this.clientId = clientId;
	}


	public String getCustomerCode() {
		return customerCode;
	}


	public void setCustomerCode(String customerCode) {
		this.customerCode= customerCode;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clientId == null) ? 0 : clientId.hashCode());
		result = prime * result + ((customerCode == null) ? 0 : customerCode.hashCode());
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (clientId == null) {
			if (other.getClientId() != null)
				return false;
		} else if (!clientId.equals(other.getClientId()))
			return false;
		if (customerCode == null) {
			if (other.getCustomerCode() != null)
				return false;
		} else if (!customerCode.equals(getCustomerCode()))
			return false;
		return true;
	}



	

	
}
