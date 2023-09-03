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
@Table(name = "doc_Details")
/**
 * @author Aswani
 */
public class DocDetails implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "doc_id", length = 100)
	private String docid;

	@Column(name = "doc_Name", length = 250)
	private String docname;

	@Column(name = "doc_Type", length = 100)
	private String doctype;

	@Column(name = "doc_size")
	private int docsize;

	@Column(name = "project_id", length = 100)
	private String projectid;

	@Column(name = "emp_id", length = 100)
	private String empid;

	@Column(name = "user_id", length = 100)
	private String userid;

	@Column(name = "expense_id", length = 100)
	private String expenseid;

	@Column(name = "bug_id", length = 100)
	private String bugid;

	@Column(name = "is_active", length = 30)
	private Boolean isactive;

	@Column(name = "created_By", length = 100)
	private String createdBy;

	@Column(name = "created_Date")
	private Date createdDate;

	@Column(name = "modified_By", length = 30)
	private String modifiedBy;

	@Column(name = "modified_Date")
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
