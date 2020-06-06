package model.bean;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class HoSoKhachHang {
	
	String tenKH;
	String cmnd;
	Date ngaySinh;
	boolean gioiTinh;
	String tinhTrang;
	String ngaysinhStr;
	String ghiChu ;
	
	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	public String getNgaysinhStr() {
		return ngaysinhStr;
	}

	public void setNgaysinhStr(String ngaysinhStr) {
		this.ngaysinhStr = ngaysinhStr;
	}

	String idHoSo ;
	

	public HoSoKhachHang() {
		
	}
	
	public HoSoKhachHang(String tenKH, String cmnd, Date ngaySinh, boolean gioiTinh) {
		this.tenKH = tenKH;
		this.cmnd = cmnd;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.tinhTrang = tinhTrang;
	}
	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	public String getCmnd() {
		return cmnd;
	}
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
	public Date getNgaySinh() {
		return this.ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		 this.ngaySinh = ngaySinh;
	}
	public boolean isGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	public String getIdHoSo() {
		return idHoSo;
	}

	public void setIdHoSo(String idHoSo) {
		this.idHoSo = idHoSo;
	}
	
	
}
