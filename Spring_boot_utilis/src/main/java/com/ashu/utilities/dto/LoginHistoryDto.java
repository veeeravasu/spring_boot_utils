package com.ashu.utilities.dto;

import java.io.Serializable;
import java.util.Date;
/**
 * @author MaheshBabu
 */
public class LoginHistoryDto implements Serializable {

	
	private static final long serialVersionUID = 1L;

	private long id;

	private String userId;

	private boolean isActive;

	private String IpAddress;

	private String CreatedBy;

	private Date CreatedDate;

	private Date modifiedDate;

	private String BrowserName;

	private String Token;

	private String RoleCode;

	private String Duration;

	private String Location;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getIpAddress() {
		return IpAddress;
	}

	public void setIpAddress(String ipAddress) {
		IpAddress = ipAddress;
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

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getBrowserName() {
		return BrowserName;
	}

	public void setBrowserName(String browserName) {
		BrowserName = browserName;
	}

	public String getToken() {
		return Token;
	}

	public void setToken(String token) {
		Token = token;
	}

	public String getRoleCode() {
		return RoleCode;
	}

	public void setRoleCode(String roleCode) {
		RoleCode = roleCode;
	}

	public String getDuration() {
		return Duration;
	}

	public void setDuration(String duration) {
		Duration = duration;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

}
