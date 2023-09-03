/**
 * 
 */
package com.ashu.utilities.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author aswani
 *
 */
public class TechnologyDetailsDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String technologyid;
	private String technologyname;
	private Boolean isactive;
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
