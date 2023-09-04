
package com.ashu.utilities.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author jyothi.ch
 *
 */
@Entity
@Table(name = "Network_Issues_Tracker")
public class NetworkIssuesTracker {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "Issue_Name")
	private String issueName;

	@Column(name = "Issuse_Id")
	private String issueId;

	@Column(name = "Remarks")
	private String remarks;

	@Column(name = "Raised_By")
	private String raisedBy;

	@Column(name = "Assign_To")
	private String assignTo;

	@Column(name = "Status")
	private String status;

	@Column(name = "Is_Active", nullable = false)
	private Boolean isActive;

	@Column(name = "Created_by", length = 50, nullable = false)
	private String createdBy;

	@Column(name = "Created_Date", nullable = false)
	private Date createdDate;

	@Column(name = "Modified_By", length = 50)
	private String modifiedBy;

	@Column(name = "ModifiedDate")
	private Date modifiedDate;

	public NetworkIssuesTracker(Long id, String issueName, String issueId, String remarks, String raisedBy,
			String assignTo, String status, Boolean isActive, String createdBy, Date createdDate, String modifiedBy,
			Date modifiedDate) {
		super();
		this.id = id;
		this.issueName = issueName;
		this.issueId = issueId;
		this.remarks = remarks;
		this.raisedBy = raisedBy;
		this.assignTo = assignTo;
		this.status = status;
		this.isActive = isActive;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
	}

	public NetworkIssuesTracker() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIssueName() {
		return issueName;
	}

	public void setIssueName(String issueName) {
		this.issueName = issueName;
	}

	public String getIssueId() {
		return issueId;
	}

	public void setIssueId(String issueId) {
		this.issueId = issueId;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getRaisedBy() {
		return raisedBy;
	}

	public void setRaisedBy(String raisedBy) {
		this.raisedBy = raisedBy;
	}

	public String getAssignTo() {
		return assignTo;
	}

	public void setAssignTo(String assignTo) {
		this.assignTo = assignTo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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
		return "NetworkIssuesTracker [id=" + id + ", issueName=" + issueName + ", issueId=" + issueId + ", remarks="
				+ remarks + ", raisedBy=" + raisedBy + ", assignTo=" + assignTo + ", status=" + status + ", isActive="
				+ isActive + ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", modifiedBy=" + modifiedBy
				+ ", modifiedDate=" + modifiedDate + "]";
	}

}
