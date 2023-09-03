package com.ashu.utilities.dto;

import java.io.Serializable;
import java.util.Date;
/**
 * @author Aswani
 */
public class DocDetailsDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String docid;
	private String docname;
	private String doctype;
	private int docsize;
	private String projectid;
	private String empid;
	private String userid;
	private String expenseid;
	private String bugid;
	private Boolean isactive;
	private String createdBy;
	private Date createdDate;
	private String modifiedBy;
	private Date modifiedDate;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDocid() {
		return docid;
	}
	public void setDocid(String docid) {
		this.docid = docid;
	}
	public String getDocname() {
		return docname;
	}
	public void setDocname(String docname) {
		this.docname = docname;
	}
	public String getDoctype() {
		return doctype;
	}
	public void setDoctype(String doctype) {
		this.doctype = doctype;
	}
	public int getDocsize() {
		return docsize;
	}
	public void setDocsize(int docsize) {
		this.docsize = docsize;
	}
	public String getProjectid() {
		return projectid;
	}
	public void setProjectid(String projectid) {
		this.projectid = projectid;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getExpenseid() {
		return expenseid;
	}
	public void setExpenseid(String expenseid) {
		this.expenseid = expenseid;
	}
	public String getBugid() {
		return bugid;
	}
	public void setBugid(String bugid) {
		this.bugid = bugid;
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
