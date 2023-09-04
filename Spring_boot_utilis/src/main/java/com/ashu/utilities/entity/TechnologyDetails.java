package com.ashu.utilities.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "technology_Details")
public class TechnologyDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "technology_id")
	private String technologyid;

	@Column(name = "technology_name")
	private String technologyname;

	@Column(name = "is_active")
	private Boolean isactive;

	@Column(name = "created_By", length = 50)
	private String createdBy;

	@Column(name = "created_Date")
	private Date createdDate;

	@Column(name = "modify_By", length = 50)
	private String modifiedBy;

	@Column(name = "modified_Date")
	private Date modifiedDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTechnologyid() {
		return technologyid;
	}

	public void setTechnologyid(String technologyid) {
		this.technologyid = technologyid;
	}

	public String getTechnologyname() {
		return technologyname;
	}

	public void setTechnologyname(String technologyname) {
		this.technologyname = technologyname;
	}

	public Boolean getIsactive() {
		return isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
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
