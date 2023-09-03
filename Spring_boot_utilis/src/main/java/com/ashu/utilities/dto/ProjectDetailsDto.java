/**
 * 
 */
package com.ashu.utilities.dto;

import java.io.Serializable;

/**
 * @author MaheshBabu
 */
class ProjectDetailsDto implements Serializable {
	
	private static final long serialVersionUID = 1L;


	private long id;

	
	private String ProjectId;

	
	private String ProjectName;

	
	private String Remarks;

	
	private String AuthorUserId;

	
	private String ProjectManager;

	
	private boolean IsActive;

	
	private String CreatedBy;

	
	private boolean CreatedDate;

	
	private String modifiedBy;
	
	
	private boolean ModifiedDate;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getProjectId() {
		return ProjectId;
	}


	public void setProjectId(String projectId) {
		ProjectId = projectId;
	}


	public String getProjectName() {
		return ProjectName;
	}


	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}


	public String getRemarks() {
		return Remarks;
	}


	public void setRemarks(String remarks) {
		Remarks = remarks;
	}


	public String getAuthorUserId() {
		return AuthorUserId;
	}


	public void setAuthorUserId(String authorUserId) {
		AuthorUserId = authorUserId;
	}


	public String getProjectManager() {
		return ProjectManager;
	}


	public void setProjectManager(String projectManager) {
		ProjectManager = projectManager;
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


	public boolean isCreatedDate() {
		return CreatedDate;
	}


	public void setCreatedDate(boolean createdDate) {
		CreatedDate = createdDate;
	}


	public String getModifiedBy() {
		return modifiedBy;
	}


	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}


	public boolean isModifiedDate() {
		return ModifiedDate;
	}


	public void setModifiedDate(boolean modifiedDate) {
		ModifiedDate = modifiedDate;
	}

	
	
}
