package com.ashu.utilities.dto;

import java.io.Serializable;
import java.util.Date;
/**
 *@author Aswani 
 */
public class InvoicedetailsHistoryDto implements Serializable {
	

	private static final long serialVersionUID = 1L;
	private Long id;
	private String invoicenum;
	private Date invoicedate;
	private Date invoiceoldDate;
	private Long amount;
	private String remarks;
	private String userid;
	private String empid;
	private Boolean isactive;
	private String createdBy;
	private Date createdDate;
	private String modifiedBy;
	private Date modifiedDate;
	private String invoiceDetailsid;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getInvoicenum() {
		return invoicenum;
	}
	public void setInvoicenum(String invoicenum) {
		this.invoicenum = invoicenum;
	}
	public Date getInvoicedate() {
		return invoicedate;
	}
	public void setInvoicedate(Date invoicedate) {
		this.invoicedate = invoicedate;
	}
	public Date getInvoiceoldDate() {
		return invoiceoldDate;
	}
	public void setInvoiceoldDate(Date invoiceoldDate) {
		this.invoiceoldDate = invoiceoldDate;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public Boolean getIsactive() {
		return isactive;
	}
	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
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
	public String getInvoiceDetailsid() {
		return invoiceDetailsid;
	}
	public void setInvoiceDetailsid(String invoiceDetailsid) {
		this.invoiceDetailsid = invoiceDetailsid;
	}
	

}
