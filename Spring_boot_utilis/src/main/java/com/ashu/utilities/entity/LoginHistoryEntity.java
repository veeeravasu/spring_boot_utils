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
@Table(name = "login_history")
public class LoginHistoryEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "user_id")
	private String userId;

	@Column(name = "is_active")
	private boolean isActive;

	@Column(name = "ip_address", length = 20)
	private String IpAddress;

	@Column(name = "created_by", length = 40)
	private String CreatedBy;

	@Column(name = "created_date")
	private Date CreatedDate ;

	@Column(name = "modified_date")
	private Date modifiedDate;
	
	@Column(name = "browser_name",length = 30)
	private String BrowserName;
	
	@Column(name = "token",length = 9000)
	private String Token;
	
	@Column(name = "role_code",length = 30)
	private String RoleCode;
	
	@Column(name = "duration",length = 50)
	private String Duration;
	
	@Column(name = "location",length = 50)
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
