package com.dreamtech.soham20.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@IdClass(SlaCustCommId.class)
@Table(name = "SLA_CUSTCOMM", schema = "dbo")
public class SlaCustComm implements Serializable {
    
    @Id
    @Column(name = "CLIENTID", length = 10, nullable = false)
    private String clientId;
    
    @Id
    @Column(name = "CUSTOMERCODE", length = 30, nullable = false)
    private String customerCode;
    
    @Id
    @Column(name = "COMMODE", length = 4, nullable = false)
    private String commode;
    
    @Column(name = "COMMDESC", length = 70)
    private String commDesc;
    
    @Column(name = "AUDITACTION", length = 1)
    private String auditAction;
    
    @Column(name = "AUDITDATETIME")
    private LocalDateTime auditDateTime;
    
    @Column(name = "USERID", length = 10)
    private String userId;
    
    @Column(name = "ID")
    private Integer id;


	public String getClientId() {
		return clientId;
	}
	
	public SlaCustComm() {
		  // Default constructor
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

	public String getCommode() {
		return commode;
	}

	public void setCommode(String commode) {
		this.commode = commode;
	}

	public String getCommDesc() {
		return commDesc;
	}

	public void setCommDesc(String commDesc) {
		this.commDesc = commDesc;
	}

	public String getAuditAction() {
		return auditAction;
	}

	public void setAuditAction(String auditAction) {
		this.auditAction = auditAction;
	}

	public LocalDateTime getAuditDateTime() {
		return auditDateTime;
	}

	public void setAuditDateTime(LocalDateTime auditDateTime) {
		this.auditDateTime = auditDateTime;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public SlaCustComm(String clientId, String customerCode, String commode, String commDesc, String auditAction,
			LocalDateTime auditDateTime, String userId, Integer id) {
		super();
		this.clientId = clientId;
		this.customerCode = customerCode;
		this.commode = commode;
		this.commDesc = commDesc;
		this.auditAction = auditAction;
		this.auditDateTime = auditDateTime;
		this.userId = userId;
		this.id = id;
	}
    
}
