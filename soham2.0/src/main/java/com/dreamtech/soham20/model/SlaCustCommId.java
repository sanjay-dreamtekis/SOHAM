package com.dreamtech.soham20.model;

import java.io.Serializable;
import java.util.Objects;

public class SlaCustCommId implements Serializable {
    
    private String clientId;
    private String customerCode;
    
    
    
    public SlaCustCommId() {
        
    }
    

	public SlaCustCommId(String clientId, String customerCode) {
		super();
		this.clientId = clientId;
		this.customerCode = customerCode;
	}
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
		SlaCustComm out = (SlaCustComm) obj;
		if (clientId == null) {
			if (out.getClientId() != null)
				return false;
		} else if (!clientId.equals(out.getClientId()))
			return false;
		if (customerCode == null) {
			if (out.getCustomerCode() != null)
				return false;
		} else if (!customerCode.equals(out.getCustomerCode()))
			return false;
		return true;
	}


	

       
}
