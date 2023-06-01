package com.dreamtech.soham20.paramdrop.model;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;




@IdClass(DropListModelKey.class)
@Entity
@Table(name ="[dbo].[SLAPARAMETER]")
public class DropListModel {
	
	@Id
	@Column(name = "CLIENTID")
	private String CLIENTID;
	@Id
	@Column(name = "FIELDNAME")
	private String fieldName;
	@Id
	@Column(name = "FIELDVALUE")
	private String FIELDVALUE;
	
	@Column(name = "ISACTIVE")
	private String ISACTIVE;
		
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "SHORTNAME")
	private String SHORTNAME;
	
	@Column(name = "VALIDATION")
	private String VALIDATION;
	
	@Column(name = "SYNCID")
	private String SYNCID;
	
	@Column(name = "DEFAULTVALUE")
	private char DEFAULTVALUE;
	
	@Column(name = "SECURED")
	private String SECURED;
	
	@Column(name = " ACTUALDT")
	private Date ACTUALDT;

	public String getISACTIVE() {
		return ISACTIVE;
	}
	public void setISACTIVE(String iSACTIVE) {
		ISACTIVE = iSACTIVE;
	}
	public String getNAME() {
		return name;
	}
	public void setNAME(String nAME) {
		name = nAME;
	}
	public String getSHORTNAME() {
		return SHORTNAME;
	}
	public void setSHORTNAME(String sHORTNAME) {
		SHORTNAME = sHORTNAME;
	}
	public String getVALIDATION() {
		return VALIDATION;
	}
	public void setVALIDATION(String vALIDATION) {
		VALIDATION = vALIDATION;
	}
	public String getSYNCID() {
		return SYNCID;
	}
	public void setSYNCID(String sYNCID) {
		SYNCID = sYNCID;
	}
	public char getDEFAULTVALUE() {
		return DEFAULTVALUE;
	}
	public void setDEFAULTVALUE(char dEFAULTVALUE) {
		DEFAULTVALUE = dEFAULTVALUE;
	}
	public String getSECURED() {
		return SECURED;
	}
	public void setSECURED(String sECURED) {
		SECURED = sECURED;
	}
	public Date getACTUALDT() {
		return ACTUALDT;
	}

	public void setACTUALDT(Date aCTUALDT) {
		ACTUALDT = aCTUALDT;
	}
	public String getCLIENTID() {
		return CLIENTID;
	}

	public void setCLIENTID(String cLIENTID) {
		CLIENTID = cLIENTID;
	}

	public String getFIELDNAME() {
		return fieldName;
	}

	public void setFIELDNAME(String fIELDNAME) {
		fieldName = fIELDNAME;
	}

	public String getFIELDVALUE() {
		return FIELDVALUE;
	}

	public void setFIELDVALUE(String fIELDVALUE) {
		FIELDVALUE = fIELDVALUE;
	}

	
	

}
