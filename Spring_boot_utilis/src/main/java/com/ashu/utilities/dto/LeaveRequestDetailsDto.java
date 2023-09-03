package com.ashu.utilities.dto;

import java.io.Serializable;
import java.util.Date;
/**
 * @author jyothi.chs
 */

public class LeaveRequestDetailsDto implements Serializable
{
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String empId;
	private String userId;
	private Date leaveFromDate;
	private Date leaveToDate;
	private String leaveAprvStatus;
	private String leaveApprovedBy;
	private String remarks;
	private String reason;
	private String leaveType;
	private String isActive;
	private String createdBy;
	private Date createdDate;
	private String modifiedBy;
	private String modifiedDate;
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
	
	
}
