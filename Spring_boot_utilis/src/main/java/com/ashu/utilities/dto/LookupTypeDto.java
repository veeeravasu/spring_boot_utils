/**
 * 
 */
package com.ashu.utilities.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author MaheshBabu
 */
public class LookupTypeDto implements Serializable {
	

	private static final long serialVersionUID = 1L;


private long id;

	
	private String LookupId;
	
	
	private String LookupName;
	
	
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


	public String getLookupId() {
		return LookupId;
	}


	public void setLookupId(String lookupId) {
		LookupId = lookupId;
	}


	public String getLookupName() {
		return LookupName;
	}


	public void setLookupName(String lookupName) {
		LookupName = lookupName;
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
