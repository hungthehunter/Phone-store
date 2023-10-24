package model;

import java.sql.Date;

public class Nguoi {
private int NguoiID;
private String hoTen;
private String gioiTinh;
private Date ngaySinh;
private String email;
private String cmnd;
private String sdt;
private String diaChi;

public Nguoi() {
	super();
}

public Nguoi(int nguoiID, String hoTen, String gioiTinh, Date ngaySinh, String email, String cmnd, String sdt,
		String diaChi) {
	super();
	NguoiID = nguoiID;
	this.hoTen = hoTen;
	this.gioiTinh = gioiTinh;
	this.ngaySinh = ngaySinh;
	this.email = email;
	this.cmnd = cmnd;
	this.sdt = sdt;
	this.diaChi = diaChi;
}

public int getNguoiID() {
	return NguoiID;
}

public void setNguoiID(int nguoiID) {
	NguoiID = nguoiID;
}

public String getHoTen() {
	return hoTen;
}

public void setHoTen(String hoTen) {
	this.hoTen = hoTen;
}

public String getGioiTinh() {
	return gioiTinh;
}

public void setGioiTinh(String gioiTinh) {
	this.gioiTinh = gioiTinh;
}

public Date getNgaySinh() {
	return ngaySinh;
}

public void setNgaySinh(Date ngaySinh) {
	this.ngaySinh = ngaySinh;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getCmnd() {
	return cmnd;
}

public void setCmnd(String cmnd) {
	this.cmnd = cmnd;
}

public String getSdt() {
	return sdt;
}

public void setSdt(String sdt) {
	this.sdt = sdt;
}

public String getDiaChi() {
	return diaChi;
}

public void setDiaChi(String diaChi) {
	this.diaChi = diaChi;
}


}
