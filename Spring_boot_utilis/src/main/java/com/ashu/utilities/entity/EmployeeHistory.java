package com.ashu.utilities.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Emp_History")
/**
 * @author=aswani
 */
public class EmployeeHistory implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "emp_id", length = 30)
	private String empid;
	
	@Column(name = "first_name", length = 40)
	private String firstname;
	
	@Column(name = "last_name", length = 40)
	private String lastname;
	
	@Column(name = "mobile_num", length = 12)
	private int mobilenum;
	
	@Column(name = "address", length = 1000)
	private String address;
	
	@Column(name = "gender", length = 20)
	private String gender;
	
	@Column(name = "join_date")
	private Date joindate;
	
	@Column(name = "is_married")
	private Boolean ismarried;
	
	@Column(name = "pan_num", length = 20)
	private String pannum;
	
	@Column(name = "aadhar_num", length = 20)
	private int aadharnum;
	
	@Column(name = "designation", length = 50)
	private String designation;
	
	@Column(name = "department", length = 50)
	private String department;
	
	@Column(name = "is_active", nullable = false)
	private Boolean isactive;
	
	@Column(name = "created_By", length = 50)
	private String createdBy;
	
	@Column(name = "created_Date", nullable = false)
	private Date createdDate;
	
	@Column(name = "modified_By", length = 50)
	private String modifiedBy;
	
	@Column(name = "modified_Date")
	private Date modifiedDate;
	
	@ManyToOne()
	 @JoinColumn(name = "emp_Details_Id")
	 EmployeeDetails obj;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getMobilenum() {
		return mobilenum;
	}

	public void setMobilenum(int mobilenum) {
		this.mobilenum = mobilenum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getJoindate() {
		return joindate;
	}

	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}

	public Boolean getIsmarried() {
		return ismarried;
	}

	public void setIsmarried(Boolean ismarried) {
		this.ismarried = ismarried;
	}

	public String getPannum() {
		return pannum;
	}

	public void setPannum(String pannum) {
		this.pannum = pannum;
	}

	public int getAadharnum() {
		return aadharnum;
	}

	public void setAadharnum(int aadharnum) {
		this.aadharnum = aadharnum;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
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
