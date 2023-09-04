package com.ashu.utilities.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * author jyothi.ch
 */
@Entity
@Table(name="Chat_Msg_UserDetails")
public class ChatMsgUserDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="From_User_Id",length=100)
	private String fromUserId;
	
	@Column(name="To_User_Id",length=100)
	private String toUserId;
	
	@Column(name="From_Emp_Id",length=100)
	private String fromEmpId;
	
	@Column(name="To_Emp_Id",length=100)
	private String toEmpId;
	
	@Column(name="Remarks",length=9000)
	private String remarks;
	
	@Column(name="Message",length=9000)
	private String message;
	
	@Column(name="Doc_Id",length=100)
	private String docId;
	
	@Column(name="Is_Active",nullable=false)
	private Boolean isActive;
	
	@Column(name="Created_By",length=100,nullable=false)
	private String createdBy;
	
	@Column(name="Created_Date",nullable =false) 
	private Date createdDate;
	
	@Column(name="Modified_By",length=100)
	private String modifiedBy;
	
	@Column(name="Modified_Date")
	private Date modifiedDate;

	public ChatMsgUserDetails(Long id, String fromUserId, String toUserId, String fromEmpId, String toEmpId,
			String remarks, String message, String docId, Boolean isActive, String createdBy, Date createdDate,
			String modifiedBy, Date modifiedDate) {
		super();
		this.id = id;
		this.fromUserId = fromUserId;
		this.toUserId = toUserId;
		this.fromEmpId = fromEmpId;
		this.toEmpId = toEmpId;
		this.remarks = remarks;
		this.message = message;
		this.docId = docId;
		this.isActive = isActive;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
	}

	public ChatMsgUserDetails() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFromUserId() {
		return fromUserId;
	}

	public void setFromUserId(String fromUserId) {
		this.fromUserId = fromUserId;
	}

	public String getToUserId() {
		return toUserId;
	}

	public void setToUserId(String toUserId) {
		this.toUserId = toUserId;
	}

	public String getFromEmpId() {
		return fromEmpId;
	}

	public void setFromEmpId(String fromEmpId) {
		this.fromEmpId = fromEmpId;
	}

	public String getToEmpId() {
		return toEmpId;
	}

	public void setToEmpId(String toEmpId) {
		this.toEmpId = toEmpId;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDocId() {
		return docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
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
		return "ChatMsgUserDetails [id=" + id + ", fromUserId=" + fromUserId + ", toUserId=" + toUserId + ", fromEmpId="
				+ fromEmpId + ", toEmpId=" + toEmpId + ", remarks=" + remarks + ", message=" + message + ", docId="
				+ docId + ", isActive=" + isActive + ", createdBy=" + createdBy + ", createdDate=" + createdDate
				+ ", modifiedBy=" + modifiedBy + ", modifiedDate=" + modifiedDate + "]";
	}
	

}
