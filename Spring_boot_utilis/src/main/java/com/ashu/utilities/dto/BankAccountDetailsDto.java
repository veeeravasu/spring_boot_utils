/**
 * 
 */
package com.ashu.utilities.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author MaheshBabu
 */
public class BankAccountDetailsDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private long id;

	private Number AccountNo;

	private String AccountHolderName;

	private String PAN;

	private String BankName;

	private String IfscCode;

	private String Acctype;

	private String BankAddress;

	private String UserId;

	private String EmpID;

	private String IsActive;

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
