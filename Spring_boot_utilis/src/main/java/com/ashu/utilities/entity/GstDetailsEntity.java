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
@Table(name = "gst_details")
public class GstDetailsEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "gst_type")
	private String GstType;

	@Column(name = "gst_applicable")
	private String GstApplicable;

	@Column(name = "gst_rate")
	private String GstRate;

	@Column(name = "igst_amount")
	private String IgstAmount;

	@Column(name = "cgst_amount")
	private String CgstAmount;

	@Column(name = "ugst_amount")
	private String UgstAmount;

	@Column(name = "tax_amount")
	private String TaxAmount;

	@Column(name = "project_id")
	private String ProjectId;

	@Column(name = "expense_id")
	private String ExpenseId;

	@Column(name = "invoice_id")
	private String InvoiceId;

	@Column(name = "is_active")
	private boolean IsActive;

	@Column(name = "created_by")
	private String CreatedBy;

	@Column(name = "created_date")
	private Date CreatedDate;

	@Column(name = "modified_by")
	private String ModifiedBy;

	@Column(name = "modified_date")
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
