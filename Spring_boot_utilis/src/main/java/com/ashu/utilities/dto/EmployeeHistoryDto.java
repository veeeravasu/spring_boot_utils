/**
 * 
 */
package com.ashu.utilities.dto;

import java.util.Date;

/**
 * @author Aswani
 *
 */
public class EmployeeHistoryDto {
	private Long id;
	private String empid;
	private String firstname;
	private String lastname;
	private int mobilenum;
	private String address;
	private String gender;
	private Date joindate;
	private Boolean ismarried;
	private String pannum;
	private int aadharnum;
	private String designation;
	private String department;
	private Boolean isactive;
	private String createdBy;
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
	private Date createdDate;
	private String modifiedBy;
	private Date modifiedDate;

	
}
