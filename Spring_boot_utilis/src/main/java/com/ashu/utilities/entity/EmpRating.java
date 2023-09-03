package com.ashu.utilities.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * @author jyothi.ch
 */
@Entity
@Table(name="Emp_Rating")
public class EmpRating implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="Emp_Id",length=40)
	private String empId;
	
	@Column(name="Email_Id",length=40)
	private String emailId;
	
	@Column(name="User_Id",length=40)
	private String userId;
	
	@Column(name="Rate_Particular",length=500)
	private String rateParticular;
	
	@Column(name="Rate",length=40)
	private int rating;
	
	@Column(name="Is_Active",nullable = false)
	private Boolean isActive;
	
	@Column(name="CREATED_BY",length=50,nullable = false)
	private String createdBy;
	
	@Column(name="Created_Date",nullable=false)
	private Date createdDate;
	
	@Column(name="Modified_By",length=50)
	private String modifiedBy;
	
	@Column(name="Modified_Date")
	private Date modifiedDate;

	public EmpRating(Long id, String empId, String emailId, String userId, String rateParticular, int rating,
			Boolean isActive, String createdBy, Date createdDate, String modifiedBy, Date modifiedDate) {
		super();
		this.id = id;
		this.empId = empId;
		this.emailId = emailId;
		this.userId = userId;
		this.rateParticular = rateParticular;
		this.rating = rating;
		this.isActive = isActive;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
	}

	public EmpRating() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getRateParticular() {
		return rateParticular;
	}

	public void setRateParticular(String rateParticular) {
		this.rateParticular = rateParticular;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
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

	@Override
	public String toString() {
		return "EmpRating [id=" + id + ", empId=" + empId + ", emailId=" + emailId + ", userId=" + userId
				+ ", rateParticular=" + rateParticular + ", rating=" + rating + ", isActive=" + isActive
				+ ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", modifiedBy=" + modifiedBy
				+ ", modifiedDate=" + modifiedDate + "]";
	}

	
	

}
