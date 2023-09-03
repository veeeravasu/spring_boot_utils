/**
 * 
 */
package com.ashu.utilities.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author MaheshBabu
 */
public class ExpentionHistoryDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private long id;

	private String ExpenseId;

	private String ExpenseName;

	private String Remarks;

	private String ExpenseFor;

	private Date ExpenseDate;

	private String ClaimId;

	private String DocId;

	private boolean IsActive;

	private String created_by;

	private Date CreatedDate;

	private String ModifiedDy;

	private Date ModifiedDate;

	private long Amount;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getExpenseId() {
		return ExpenseId;
	}

	public void setExpenseId(String expenseId) {
		ExpenseId = expenseId;
	}

	public String getExpenseName() {
		return ExpenseName;
	}

	public void setExpenseName(String expenseName) {
		ExpenseName = expenseName;
	}

	public String getRemarks() {
		return Remarks;
	}

	public void setRemarks(String remarks) {
		Remarks = remarks;
	}

	public String getExpenseFor() {
		return ExpenseFor;
	}

	public void setExpenseFor(String expenseFor) {
		ExpenseFor = expenseFor;
	}

	public Date getExpenseDate() {
		return ExpenseDate;
	}

	public void setExpenseDate(Date expenseDate) {
		ExpenseDate = expenseDate;
	}

	public String getClaimId() {
		return ClaimId;
	}

	public void setClaimId(String claimId) {
		ClaimId = claimId;
	}

	public String getDocId() {
		return DocId;
	}

	public void setDocId(String docId) {
		DocId = docId;
	}

	public boolean isIsActive() {
		return IsActive;
	}

	public void setIsActive(boolean isActive) {
		IsActive = isActive;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public Date getCreatedDate() {
		return CreatedDate;
	}

	public void setCreatedDate(Date createdDate) {
		CreatedDate = createdDate;
	}

	public String getModifiedDy() {
		return ModifiedDy;
	}

	public void setModifiedDy(String modifiedDy) {
		ModifiedDy = modifiedDy;
	}

	public Date getModifiedDate() {
		return ModifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		ModifiedDate = modifiedDate;
	}

	public long getAmount() {
		return Amount;
	}

	public void setAmount(long amount) {
		Amount = amount;
	}

}
