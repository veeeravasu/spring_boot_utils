/**
 * 
 */
package com.ashu.utilities.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * @author MaheshBabu
 */
@Entity
@Table(name = "project_details")
public class ProjectDetailsEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "project_id", length = 100)
	private String ProjectId;

	@Column(name = "project_name", length = 200)
	private String ProjectName;

	@Column(name = "remarks", length = 9000)
	private String Remarks;

	@Column(name = "author_user_id", length = 200)
	private String AuthorUserId;

	@Column(name = "project_manager", length = 200)
	private String ProjectManager;

	@Column(name = "is_active", length = 200)
	private boolean IsActive;

	@Column(name = "created_by", length = 200)
	private String CreatedBy;

	@Column(name = "created_date")
	private boolean CreatedDate;

	@Column(name = "modified_by", length = 50)
	private String modifiedBy;
	
	@Column(name = "modified_date")
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
