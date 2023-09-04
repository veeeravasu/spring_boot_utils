/**
 * 
 */
package com.ashu.utilities.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author jyothi ch
 *
 */
@Entity
@Table(name="Lokop_Values")
public class LokopValues {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="Lokop_Type_Id",length=100)
	private String lokopTypeId;
	
	@Column(name="Lokop_Val_Id",length=100)
	private String lokopValId;
	
	@Column(name="Lokop_Value",length=400)
	private String lokopValue;
	
	@Column(name="Is_Active",nullable=false)
	private Boolean isActive;
	
	@Column(name="Created_By",length=100,nullable = false)  
	private String createdBy;
	
	@Column(name="Created_Date",nullable = false)
	private Date createdDate;
	
	@Column(name="Modified_By",length=100)
	private String modifiedBy;
	
	@Column(name="Modified_Date")
	private Date modifiedDate;

	public LokopValues(Long id, String lokopTypeId, String lokopValId, String lokopValue, Boolean isActive,
			String createdBy, Date createdDate, String modifiedBy, Date modifiedDate) {
		super();
		this.id = id;
		this.lokopTypeId = lokopTypeId;
		this.lokopValId = lokopValId;
		this.lokopValue = lokopValue;
		this.isActive = isActive;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
	}

	public LokopValues() {
		super();
	}

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

	@Override
	public String toString() {
		return "LokopValues [id=" + id + ", lokopTypeId=" + lokopTypeId + ", lokopValId=" + lokopValId + ", lokopValue="
				+ lokopValue + ", isActive=" + isActive + ", createdBy=" + createdBy + ", createdDate=" + createdDate
				+ ", modifiedBy=" + modifiedBy + ", modifiedDate=" + modifiedDate + "]";
	}

}
