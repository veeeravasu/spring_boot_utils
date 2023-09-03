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
@Table(name = "bank_account_details")
public class BankAccountDetailsEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "account_no")
	private Number AccountNo;

	@Column(name = "account_holder_name", length = 100)
	private String AccountHolderName;

	@Column(name = "pan_num", length = 10)
	private String PAN;

	@Column(name = "bank_name", length = 100)
	private String BankName;

	@Column(name = "ifsc_code", length = 100)
	private String IfscCode;

	@Column(name = "acc_type", length = 100)
	private String Acctype;

	@Column(name = "bank_address", length = 9000)
	private String BankAddress;

	@Column(name = "user_id", length = 50)
	private String UserId;

	@Column(name = "emp_id", length = 50)
	private String EmpID;

	@Column(name = "is_active")
	private String IsActive;

	@Column(name = "created_by", length = 50)
	private String CreatedBy;

	@Column(name = "created_date")
	private Date CreatedDate;

	@Column(name = "modified_by", length = 50)
	private String ModifiedBy;

	@Column(name = "modified_date")
	private Date ModifiedDate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Number getAccountNo() {
		return AccountNo;
	}

	public void setAccountNo(Number accountNo) {
		AccountNo = accountNo;
	}

	public String getAccountHolderName() {
		return AccountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		AccountHolderName = accountHolderName;
	}

	public String getPAN() {
		return PAN;
	}

	public void setPAN(String pAN) {
		PAN = pAN;
	}

	public String getBankName() {
		return BankName;
	}

	public void setBankName(String bankName) {
		BankName = bankName;
	}

	public String getIfscCode() {
		return IfscCode;
	}

	public void setIfscCode(String ifscCode) {
		IfscCode = ifscCode;
	}

	public String getAcctype() {
		return Acctype;
	}

	public void setAcctype(String acctype) {
		Acctype = acctype;
	}

	public String getBankAddress() {
		return BankAddress;
	}

	public void setBankAddress(String bankAddress) {
		BankAddress = bankAddress;
	}

	public String getUserId() {
		return UserId;
	}

	public void setUserId(String userId) {
		UserId = userId;
	}

	public String getEmpID() {
		return EmpID;
	}

	public void setEmpID(String empID) {
		EmpID = empID;
	}

	public String getIsActive() {
		return IsActive;
	}

	public void setIsActive(String isActive) {
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
