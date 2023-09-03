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
 * @author Maheshbabu
 */

@Entity
@Table(name = "bug_details")
public class BugDetailsEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "Bug_id", length = 50)
	private String firstName;

	@Column(name = "remarks", length = 9000)
	private String Remarks;

	@Column(name = "emp_id", length = 40)
	private String EmpID;

	@Column(name = "user_id", length = 40)
	private String UserID;

	@Column(name = "project_id", length = 40)
	private String ProjectId;

	@Column(name = "assign_to", length = 100)
	private String AssignTo;

	@Column(name = "assign_from", length = 100)
	private String AssignFrom;

	@Column(name = "doc_id", length = 40)
	private String DocId;

	@Column(name = "status", length = 250)
	private String Status;

	@Column(name = "total_spent_hours", length = 50)
	private String TotalSpentHours;

	@Column(name = "priority", length = 200)
	private String Priority;

	@Column(name = "parent_task", length = 200)
	private String ParentTask;

	@Column(name = "task_start_date")
	private Date TaskStartDate;

	@Column(name = "task_etart_date")
	private Date TaskEtartDate;

	@Column(name = "task_type", length = 200)
	private String TaskType;

	@Column(name = "env_type", length = 200)
	private String EnvType;

	@Column(name = "estimated_hours", length = 40)
	private String EstimatedHours;

	@Column(name = "is_active")
	private boolean IsActive;

	@Column(name = "created_by", length = 50)
	private String CreatedBy;

	@Column(name = "created_date")
	private Date CreatedDate;

	@Column(name = "modified_by", length = 50)
	private String ModifiedBy;

	@Column(name = "modified_date")
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
