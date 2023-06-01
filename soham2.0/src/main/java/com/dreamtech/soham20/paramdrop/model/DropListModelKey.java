package com.dreamtech.soham20.paramdrop.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;


public class DropListModelKey implements Serializable {
    
	  
	private String CLIENTID;
	private String fieldName;   
	private String FIELDVALUE;
	
	 public String getCLIENTID() {
			return CLIENTID;
		}
		public void setCLIENTID(String cLIENTID) {
			CLIENTID = cLIENTID;
		}
		public String getFieldName() {
			return fieldName;
		}
		public void setFieldName(String fieldName) {
			this.fieldName = fieldName;
		}
		public String getFIELDVALUE() {
			return FIELDVALUE;
		}
		public void setFIELDVALUE(String fIELDVALUE) {
			FIELDVALUE = fIELDVALUE;
		}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CLIENTID == null) ? 0 : CLIENTID.hashCode());
		result = prime * result + ((FIELDVALUE == null) ? 0 : FIELDVALUE.hashCode());
		result = prime * result + ((fieldName == null) ? 0 : fieldName.hashCode());
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
		DropListModelKey other = (DropListModelKey) obj;
		if (CLIENTID == null) {
			if (other.CLIENTID != null)
				return false;
		} else if (!CLIENTID.equals(other.CLIENTID))
			return false;
		if (FIELDVALUE == null) {
			if (other.FIELDVALUE != null)
				return false;
		} else if (!FIELDVALUE.equals(other.FIELDVALUE))
			return false;
		if (fieldName == null) {
			if (other.fieldName != null)
				return false;
		} else if (!fieldName.equals(other.fieldName))
			return false;
		return true;
	}
	
	
}
