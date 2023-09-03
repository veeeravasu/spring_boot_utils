/**
 * 
 */
package com.ashu.utilities.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.Timer;

/**
 * @author Jyothi Ch
 *
 */
public class InterviewDetailsDto implements Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private String interviewId;
	private String candidateId;
	private String candidateName;
	private Date scheduleDate;
	private Timer scheduleTime;
	private int spentHours;
	private String interviewerId;
	private String interviewName;
	private String status;
	private String remarks;
	private Boolean isActive;
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
	public String getInterviewId() {
		return interviewId;
	}
	public void setInterviewId(String interviewId) {
		this.interviewId = interviewId;
	}
	public String getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(String candidateId) {
		this.candidateId = candidateId;
	}
	public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	public Date getScheduleDate() {
		return scheduleDate;
	}
	public void setScheduleDate(Date scheduleDate) {
		this.scheduleDate = scheduleDate;
	}
	public Timer getScheduleTime() {
		return scheduleTime;
	}
	public void setScheduleTime(Timer scheduleTime) {
		this.scheduleTime = scheduleTime;
	}
	public int getSpentHours() {
		return spentHours;
	}
	public void setSpentHours(int spentHours) {
		this.spentHours = spentHours;
	}
	public String getInterviewerId() {
		return interviewerId;
	}
	public void setInterviewerId(String interviewerId) {
		this.interviewerId = interviewerId;
	}
	public String getInterviewName() {
		return interviewName;
	}
	public void setInterviewName(String interviewName) {
		this.interviewName = interviewName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
