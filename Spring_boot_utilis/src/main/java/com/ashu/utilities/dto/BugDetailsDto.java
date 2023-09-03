package com.ashu.utilities.dto;

import java.io.Serializable;
import java.util.Date;
/**
 * @author MaheshBabu
 */
public class BugDetailsDto implements Serializable {

	
	private static final long serialVersionUID = 1L;

	private long id;

	private String firstName;

	private String Remarks;

	private String EmpID;

	private String UserID;

	private String ProjectId;

	private String AssignTo;

	private String AssignFrom;

	private String DocId;

	private String Status;

	private String TotalSpentHours;

	private String Priority;

	private String ParentTask;

	private Date TaskStartDate;

	private Date TaskEtartDate;

	private String TaskType;

	private String EnvType;

	private String EstimatedHours;

	private boolean IsActive;

	private String CreatedBy;

	private Date CreatedDate;

	private String ModifiedBy;

	private Date ModifiedDate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getRemarks() {
		return Remarks;
	}

	public void setRemarks(String remarks) {
		Remarks = remarks;
	}

	public String getEmpID() {
		return EmpID;
	}

	public void setEmpID(String empID) {
		EmpID = empID;
	}

	public String getUserID() {
		return UserID;
	}

	public void setUserID(String userID) {
		UserID = userID;
	}

	public String getProjectId() {
		return ProjectId;
	}

	public void setProjectId(String projectId) {
		ProjectId = projectId;
	}

	public String getAssignTo() {
		return AssignTo;
	}

	public void setAssignTo(String assignTo) {
		AssignTo = assignTo;
	}

	public String getAssignFrom() {
		return AssignFrom;
	}

	public void setAssignFrom(String assignFrom) {
		AssignFrom = assignFrom;
	}

	public String getDocId() {
		return DocId;
	}

	public void setDocId(String docId) {
		DocId = docId;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getTotalSpentHours() {
		return TotalSpentHours;
	}

	public void setTotalSpentHours(String totalSpentHours) {
		TotalSpentHours = totalSpentHours;
	}

	public String getPriority() {
		return Priority;
	}

	public void setPriority(String priority) {
		Priority = priority;
	}

	public String getParentTask() {
		return ParentTask;
	}

	public void setParentTask(String parentTask) {
		ParentTask = parentTask;
	}

	public Date getTaskStartDate() {
		return TaskStartDate;
	}

	public void setTaskStartDate(Date taskStartDate) {
		TaskStartDate = taskStartDate;
	}

	public Date getTaskEtartDate() {
		return TaskEtartDate;
	}

	public void setTaskEtartDate(Date taskEtartDate) {
		TaskEtartDate = taskEtartDate;
	}

	public String getTaskType() {
		return TaskType;
	}

	public void setTaskType(String taskType) {
		TaskType = taskType;
	}

	public String getEnvType() {
		return EnvType;
	}

	public void setEnvType(String envType) {
		EnvType = envType;
	}

	public String getEstimatedHours() {
		return EstimatedHours;
	}

	public void setEstimatedHours(String estimatedHours) {
		EstimatedHours = estimatedHours;
	}

	public boolean isIsActive() {
		return IsActive;
	}

	public void setIsActive(boolean isActive) {
		IsActive = isActive;
	}

	public String getCreatedBy() {
		return CreatedBy;
	}

	public void setCreatedBy(String createdBy) {
		CreatedBy = createdBy;
	}

	public Date getCreatedDate() {
		return CreatedDate;
	}

	public void setCreatedDate(Date createdDate) {
		CreatedDate = createdDate;
	}

	public String getModifiedBy() {
		return ModifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		ModifiedBy = modifiedBy;
	}

	public Date getModifiedDate() {
		return ModifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		ModifiedDate = modifiedDate;
	}

	
}
