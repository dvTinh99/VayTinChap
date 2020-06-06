package model.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HoSoCV extends HoSoKhachHang{
	
	String lichSuGoi;
	String noteTinhTrang;
	int trangThai;
	List<TieuChi> list = new ArrayList<TieuChi>();
	
	public HoSoCV() {
		super();
	}
	
	public HoSoCV(String tenKH, 
			String cmnd, 
			Date ngaySinh, 
			boolean gioiTinh, 
			String lichSuGoi,
			String noteTinhTrang, 
			int trangThai, 
			List<TieuChi> list) {
		
		super(tenKH, cmnd, ngaySinh, gioiTinh);
		this.lichSuGoi = lichSuGoi;
		this.noteTinhTrang = noteTinhTrang;
		this.trangThai = trangThai;
		this.list = list;
		
	}

	public String getLichSuGoi() {
		return lichSuGoi;
	}

	public void setLichSuGoi(String lichSuGoi) {
		this.lichSuGoi = lichSuGoi;
	}

	public String getNoteTinhTrang() {
		return noteTinhTrang;
	}

	public void setNoteTinhTrang(String noteTinhTrang) {
		this.noteTinhTrang = noteTinhTrang;
	}

	public int getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(int trangThai) {
		this.trangThai = trangThai;
	}

	public List<TieuChi> getList() {
		return list;
	}

	public void setList(List<TieuChi> list) {
		this.list = list;
	}
	
}
