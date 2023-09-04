/**
 * 
 */
package com.ashu.utilities.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author MaheshBabu
 */
public class GstDetailsDto implements Serializable {

	
	private static final long serialVersionUID = 1L;

	private long id;

	private String GstType;

	private String GstApplicable;

	private String GstRate;

	private String IgstAmount;

	private String CgstAmount;

	private String UgstAmount;

	private String TaxAmount;

	private String ProjectId;

	private String ExpenseId;

	private String InvoiceId;

	private boolean IsActive;

	private String CreatedBy;

	private Date CreatedDate;

	private String ModifiedBy;

	private Date modified_date;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getGstType() {
		return GstType;
	}

	public void setGstType(String gstType) {
		GstType = gstType;
	}

	public String getGstApplicable() {
		return GstApplicable;
	}

	public void setGstApplicable(String gstApplicable) {
		GstApplicable = gstApplicable;
	}

	public String getGstRate() {
		return GstRate;
	}

	public void setGstRate(String gstRate) {
		GstRate = gstRate;
	}

	public String getIgstAmount() {
		return IgstAmount;
	}

	public void setIgstAmount(String igstAmount) {
		IgstAmount = igstAmount;
	}

	public String getCgstAmount() {
		return CgstAmount;
	}

	public void setCgstAmount(String cgstAmount) {
		CgstAmount = cgstAmount;
	}

	public String getUgstAmount() {
		return UgstAmount;
	}

	public void setUgstAmount(String ugstAmount) {
		UgstAmount = ugstAmount;
	}

	public String getTaxAmount() {
		return TaxAmount;
	}

	public void setTaxAmount(String taxAmount) {
		TaxAmount = taxAmount;
	}

	public String getProjectId() {
		return ProjectId;
	}

	public void setProjectId(String projectId) {
		ProjectId = projectId;
	}

	public String getExpenseId() {
		return ExpenseId;
	}

	public void setExpenseId(String expenseId) {
		ExpenseId = expenseId;
	}

	public String getInvoiceId() {
		return InvoiceId;
	}

	public void setInvoiceId(String invoiceId) {
		InvoiceId = invoiceId;
	}

	public boolean isIsActive() {
		return IsActive;
	}

	public void setIsActive(boolean isActive) {
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

	public Date getModified_date() {
		return modified_date;
	}

	public void setModified_date(Date modified_date) {
		this.modified_date = modified_date;
	}

	
}
