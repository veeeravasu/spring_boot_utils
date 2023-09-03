/**
 * 
 */
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
 * @author MaheshBabu
 */
@Entity
@Table(name = "lookup_type")
public class LookupTypeEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "lookup_id", length = 100)
	private String LookupId;

	@Column(name = "lookup_name", length = 250)
	private String LookupName;

	@Column(name = "is_active")
	private boolean IsActive;

	@Column(name = "created_by", length = 100)
	private String CreatedBy;

	@Column(name = "created_date")
	private Date CreatedDate;

	@Column(name = "modified_by", length = 100)
	private String ModifiedBy;

	@Column(name = "modified_date")
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
