package com.ashu.utilities.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 * @author Aswani
 */
@Entity
@Table(name="invoice_Details")
public class InvoiceDetails implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	
	@Column(name = "invoice_num",length=100)
	private String invoicenum;
	
	@Column(name = "invoice_Date",length=100)
	private Date invoicedate;
	
	@Column(name = "invoice_old_Date",length=100)
	private Date invoiceoldDate;
	
	@Column(name = "amount",length=100000)
	private Long amount;
	
	@Column(name = "remarks",length=9000)
	private String remarks;
	
	@Column(name = "user_id",length=100)
	private String userid;
	
	@Column(name = "emp_id",length=100)
	private String empid;
	
	@Column(name = "is_active")
	private Boolean isactive;
	
	@Column(name = "created_By",length=90)
	private String createdBy;
	
	@Column(name = "created_Date")
	private Date createdDate;
	
	@Column(name = "modified_By",length=90)
	private String modifiedBy;
	
	@Column(name = "modified_Date")
	private Date modifiedDate;
	 @OneToMany(cascade = CascadeType.ALL)
	    private Set<InvoiceDetailsHistory> ob;
	
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
	
	

}
