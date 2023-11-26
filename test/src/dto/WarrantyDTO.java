package dto;

import java.sql.Date;

public class WarrantyDTO {
	public WarrantyDTO() {
		
	}
	public WarrantyDTO(int warrantyId, int customerId, String productName, Date dateReceived, Date dateReturned,
			double warrantyFee, int warrantyStatusId, String warrantyDescription) {
		this.warrantyId = warrantyId;
		this.customerId = customerId;
		this.productName = productName;
		this.dateReceived = dateReceived;
		this.dateReturned = dateReturned;
		this.warrantyFee = warrantyFee;
		this.warrantyStatusId = warrantyStatusId;
		this.warrantyDescription = warrantyDescription;
	}
	@Override
	public String toString() {
		return "WarrantyDTO [warrantyId=" + warrantyId + ", customerId=" + customerId + ", productName=" + productName
				+ ", dateReceived=" + dateReceived + ", dateReturned=" + dateReturned + ", warrantyFee=" + warrantyFee
				+ ", warrantyStatusId=" + warrantyStatusId + ", warrantyDescription=" + warrantyDescription + "]";
	}
	public int getWarrantyId() {
		return warrantyId;
	}
	public void setWarrantyId(int warrantyId) {
		this.warrantyId = warrantyId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public java.sql.Date getDateReceived() {
		return dateReceived;
	}
	public void setDateReceived(java.sql.Date dateReceived) {
		this.dateReceived = dateReceived;
	}
	public java.sql.Date getDateReturned() {
		return dateReturned;
	}
	public void setDateReturned(java.sql.Date dateReturned) {
		this.dateReturned = dateReturned;
	}
	public double getWarrantyFee() {
		return warrantyFee;
	}
	public void setWarrantyFee(double warrantyFee) {
		this.warrantyFee = warrantyFee;
	}
	public int getWarrantyStatusId() {
		return warrantyStatusId;
	}
	public void setWarrantyStatusId(int warrantyStatusId) {
		this.warrantyStatusId = warrantyStatusId;
	}
	public String getWarrantyDescription() {
		return warrantyDescription;
	}
	public void setWarrantyDescription(String warrantyDescription) {
		this.warrantyDescription = warrantyDescription;
	}

	private int warrantyId;
	private int customerId;
	private String productName;
	private java.sql.Date dateReceived;
	private java.sql.Date dateReturned;
	private double warrantyFee;
	private int warrantyStatusId;
	private String warrantyDescription;
}
