/**
 * 
 */
package com.ashu.utilities.dto;

import java.util.Date;

/**
 * @author jyothi.vh
 *
 */
public class LokopValuesDto {
	private Long id;
	private String lokopTypeId;
	private String lokopValId;
	private String lokopValue;
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
	public String getLokopTypeId() {
		return lokopTypeId;
	}
	public void setLokopTypeId(String lokopTypeId) {
		this.lokopTypeId = lokopTypeId;
	}
	public String getLokopValId() {
		return lokopValId;
	}
	public void setLokopValId(String lokopValId) {
		this.lokopValId = lokopValId;
	}
	public String getLokopValue() {
		return lokopValue;
	}
	public void setLokopValue(String lokopValue) {
		this.lokopValue = lokopValue;
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


}
