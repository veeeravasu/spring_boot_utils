package com.ashu.utilities.dto;

import java.io.Serializable;
import java.util.Date;
/**
 * @author MaheshBabu
 */
public class RoleDetailsDto implements Serializable {

	
	private static final long serialVersionUID = 1L;

	private long id;

	private String code;

	private boolean isActive;

	private String createdBy;

	private Date createdDate;

	private Date modified;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
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

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

}
