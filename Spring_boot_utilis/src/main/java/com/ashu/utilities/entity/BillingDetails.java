package com.ashu.utilities.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Billing_Details")
/**
 * @author jyothi ch
 */
public class BillingDetails implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="Bill_Num",length=200)
	private String billNum;
	
	@Column(name="Bill_Title",length=400)
	private String billTitle;
	
	@Column(name="Remarks",length=9000)
	private String remarks;
	
	@Column(name="Billing_Id",length=100)
	private String billing_id;
	
	@Column(name="Is_Active",nullable=false)
	private Boolean isActive;
	
	@Column(name="Created_By",length=50,nullable=false)
	private String createdBy;
	
	@Column(name="Created_Date",nullable=false)
	private Date createdDate;
	
	@Column(name="modified_By",nullable=false)
	private String modifiedBy;
	
	@Column(name="modified_Date")
	private Date modifiedDate;
	
	public BillingDetails(Long id, String billNum, String billTitle, String remarks, String billing_id,
			Boolean isActive, String createdBy, Date createdDate, String modifiedBy, Date modifiedDate) {
		super();
		this.id = id;
		this.billNum = billNum;
		this.billTitle = billTitle;
		this.remarks = remarks;
		this.billing_id = billing_id;
		this.isActive = isActive;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
	}

	public BillingDetails() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBillNum() {
		return billNum;
	}

	public void setBillNum(String billNum) {
		this.billNum = billNum;
	}

	public String getBillTitle() {
		return billTitle;
	}

	public void setBillTitle(String billTitle) {
		this.billTitle = billTitle;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getBilling_id() {
		return billing_id;
	}

	public void setBilling_id(String billing_id) {
		this.billing_id = billing_id;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "BillingDetails [id=" + id + ", billNum=" + billNum + ", billTitle=" + billTitle + ", remarks=" + remarks
				+ ", billing_id=" + billing_id + ", isActive=" + isActive + ", createdBy=" + createdBy
				+ ", createdDate=" + createdDate + ", modifiedBy=" + modifiedBy + ", modifiedDate=" + modifiedDate
				+ "]";
	}
	

	
	
}
