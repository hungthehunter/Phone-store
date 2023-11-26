package dto;


public class SupplierDTO {
	@Override
	public String toString() {
		return "SupplierDTO [SupplierId=" + SupplierId + ", SupplierName=" + SupplierName + ", Phone="
				+ Phone + ", Address=" + Address + ", Email=" + Email + ", Note=" + Note + "]";
	}
	public int getSupplierId() {
		return SupplierId;
	}
	public void setSupplierId(int supplierId) {
		SupplierId = supplierId;
	}
	public String getSupplierName() {
		return SupplierName;
	}
	public void setSupplierName(String supplierName) {
		SupplierName = supplierName;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getNote() {
		return Note;
	}
	public void setNote(String note) {
		Note = note;
	}
	private int SupplierId;
	private String SupplierName;
	private String Phone;
	private String Address;
	private String Email;
	private String Note;

	public SupplierDTO(int supplierId, String supplierName, String phone, String address, String email, String note) {
		SupplierId = supplierId;
		SupplierName = supplierName;
		Phone = phone;
		Address = address;
		Email = email;
		Note = note;
	}
	public SupplierDTO() {
		
	}
	
}
