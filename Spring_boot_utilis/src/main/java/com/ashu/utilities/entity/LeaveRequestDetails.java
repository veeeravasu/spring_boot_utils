package com.ashu.utilities.entity;

import java.io.Serializable;
import java.util.Date;

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
@Table(name="Leave_Request_Detailss")
public class LeaveRequestDetails implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="Emp_Id",length=40)
	private String empId;
	
	@Column(name="User_Id",length=40)
	private String userId;
	
	@Column(name="Leave_From_Date")
	private Date leaveFromDate;
	
	@Column(name="Leave_To_Date")
	private Date leaveToDate;
	
	@Column(name="Leave_Approve_Status",length=50)
	private String leaveAprvStatus;
	
	@Column(name="Leave_Approved_By",length=50) 
	private String leaveApprovedBy;
	
	@Column(name="Remarks",length=5000)
	private String remarks;
	
	@Column(name="Reason",length=5000)
	private String reason;
	
	@Column(name="Leave_Type",length=100)
	private String leaveType;
	
	@Column(name="Is_Active",nullable = false)
	private String isActive;
	
	@Column(name="Created_By",length=50,nullable=false)
	private String createdBy;
	
	@Column(name="Creted_By",nullable = false)
	private Date createdDate;
	
	@Column(name="Modified_By",length=50)
	private String modifiedBy;
	
	@Column(name="Modified_Date")
	private String modifiedDate;

	public LeaveRequestDetails(Long id, String empId, String userId, Date leaveFromDate, Date leaveToDate,
			String leaveAprvStatus, String leaveApprovedBy, String remarks, String reason, String leaveType,
			String isActive, String createdBy, Date createdDate, String modifiedBy, String modifiedDate) {
		super();
		this.id = id;
		this.empId = empId;
		this.userId = userId;
		this.leaveFromDate = leaveFromDate;
		this.leaveToDate = leaveToDate;
		this.leaveAprvStatus = leaveAprvStatus;
		this.leaveApprovedBy = leaveApprovedBy;
		this.remarks = remarks;
		this.reason = reason;
		this.leaveType = leaveType;
		this.isActive = isActive;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
	}

	public LeaveRequestDetails() {
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

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Date getLeaveFromDate() {
		return leaveFromDate;
	}

	public void setLeaveFromDate(Date leaveFromDate) {
		this.leaveFromDate = leaveFromDate;
	}

	public Date getLeaveToDate() {
		return leaveToDate;
	}

	public void setLeaveToDate(Date leaveToDate) {
		this.leaveToDate = leaveToDate;
	}

	public String getLeaveAprvStatus() {
		return leaveAprvStatus;
	}

	public void setLeaveAprvStatus(String leaveAprvStatus) {
		this.leaveAprvStatus = leaveAprvStatus;
	}

	public String getLeaveApprovedBy() {
		return leaveApprovedBy;
	}

	public void setLeaveApprovedBy(String leaveApprovedBy) {
		this.leaveApprovedBy = leaveApprovedBy;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
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

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@Override
	public String toString() {
		return "LeaveRequestDetails [id=" + id + ", empId=" + empId + ", userId=" + userId + ", leaveFromDate="
				+ leaveFromDate + ", leaveToDate=" + leaveToDate + ", leaveAprvStatus=" + leaveAprvStatus
				+ ", leaveApprovedBy=" + leaveApprovedBy + ", remarks=" + remarks + ", reason=" + reason
				+ ", leaveType=" + leaveType + ", isActive=" + isActive + ", createdBy=" + createdBy + ", createdDate="
				+ createdDate + ", modifiedBy=" + modifiedBy + ", modifiedDate=" + modifiedDate + "]";
	}
	
	
}
	