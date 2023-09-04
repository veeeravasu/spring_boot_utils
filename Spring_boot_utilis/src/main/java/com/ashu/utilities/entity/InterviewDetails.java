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
 * @author jyothi ch
 */
@Entity
@Table(name = "Interview_Details")
public class InterviewDetails implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "Interview_Id")
	private String interviewId;

	@Column(name = "Candidate_Id")
	private String candidateId;

	@Column(name = "Candidate_Name")
	private String candidateName;

	@Column(name = "Schedule_Date")
	private Date scheduleDate;

	@Column(name = "Schedule_Time")
	private Date scheduleTime;

	@Column(name = "Spent_Hours")
	private int spentHours;

	@Column(name = "Interviewer_Id")
	private String interviewerId;

	@Column(name = "Interview_Name")
	private String interviewName;

	@Column(name = "Status")
	private String status;

	@Column(name = "Remarks")
	private String remarks;

	@Column(name = "Is_Active", nullable = false)
	Boolean isActive;

	@Column(name = "Created_By", length = 50, nullable = false)
	private String createdBy;

	@Column(name = "Created_Date")
	private Date createdDate;

	@Column(name = "Modified_By", length = 50)
	private String modifiedBy;

	@Column(name = "Modified_Date")
	private Date modifiedDate;

	public InterviewDetails(Long id, String interviewId, String candidateId, String candidateName, Date scheduleDate,
			Date scheduleTime, int spentHours, String interviewerId, String interviewName, String status,
			String remarks, Boolean isActive, String createdBy, Date createdDate, String modifiedBy,
			Date modifiedDate) {
		super();
		this.id = id;
		this.interviewId = interviewId;
		this.candidateId = candidateId;
		this.candidateName = candidateName;
		this.scheduleDate = scheduleDate;
		this.scheduleTime = scheduleTime;
		this.spentHours = spentHours;
		this.interviewerId = interviewerId;
		this.interviewName = interviewName;
		this.status = status;
		this.remarks = remarks;
		this.isActive = isActive;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
	}

	public InterviewDetails() {
		super();
	}

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

	public Date getScheduleTime() {
		return scheduleTime;
	}

	public void setScheduleTime(Date scheduleTime) {
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

	@Override
	public String toString() {
		return "InterviewDetails [id=" + id + ", interviewId=" + interviewId + ", candidateId=" + candidateId
				+ ", candidateName=" + candidateName + ", scheduleDate=" + scheduleDate + ", scheduleTime="
				+ scheduleTime + ", spentHours=" + spentHours + ", interviewerId=" + interviewerId + ", interviewName="
				+ interviewName + ", status=" + status + ", remarks=" + remarks + ", isActive=" + isActive
				+ ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", modifiedBy=" + modifiedBy
				+ ", modifiedDate=" + modifiedDate + "]";
	}

}
