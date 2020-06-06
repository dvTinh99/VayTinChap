package model.bean;

import java.util.Date;

public class HoSoIV extends HoSoKhachHang{
	String sdt ;
	String diaChi;
	int trangThai ;
	
	public int getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(int trangThai) {
		this.trangThai = trangThai;
	}
	public HoSoIV() {
		
	}
	public HoSoIV(String tenKH, String cmnd, Date ngaySinh, boolean gioiTinh, String idHoSo, String sdt, String diaChi) {
		super(tenKH, cmnd, ngaySinh, gioiTinh);
		this.idHoSo = idHoSo;
		this.sdt = sdt;
		this.diaChi = diaChi;
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
