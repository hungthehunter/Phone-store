package model;

public class NhanVien {
private int NV_NguoiID;
private String chucVu;
private double luong;
public NhanVien() {
	super();
}
public NhanVien(int nV_NguoiID, String chucVu, double luong) {
	super();
	NV_NguoiID = nV_NguoiID;
	this.chucVu = chucVu;
	this.luong = luong;
}
public int getNV_NguoiID() {
	return NV_NguoiID;
}
public void setNV_NguoiID(int nV_NguoiID) {
	NV_NguoiID = nV_NguoiID;
}
public String getChucVu() {
	return chucVu;
}
public void setChucVu(String chucVu) {
	this.chucVu = chucVu;
}
public double getLuong() {
	return luong;
}
public void setLuong(double luong) {
	this.luong = luong;
}


}
