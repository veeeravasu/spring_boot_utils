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
@Table (name = "expention_history")
public class ExpentionHistoryEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "expense_id", length = 100)
	private String ExpenseId;

	@Column(name = "expense_name", length = 250)
	private String ExpenseName;

	@Column(name = "remarks", length = 9000)
	private String Remarks;

	@Column(name = "expense_for", length = 250)
	private String ExpenseFor;

	@Column(name = "expense_date")
	private Date ExpenseDate;

	@Column(name = "claim_id", length = 100)
	private String ClaimId;

	@Column(name = "doc_id", length = 100)
	private String DocId;

	@Column(name = "is_active")
	private boolean IsActive;

	@Column(name = "created_by", length = 50)
	private String created_by;

	@Column(name = "created_date")
	private Date CreatedDate;

	@Column(name = "modified_by", length = 50)
	private String ModifiedDy;

	@Column(name = "modified_date")
	private Date ModifiedDate;

	@Column(name = "amount")
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
