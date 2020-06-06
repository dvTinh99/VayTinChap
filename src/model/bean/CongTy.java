package model.bean;

public class CongTy {
	String tenCty;
	String mSoThue;
	String diaChi;
	String loaiCongTy ;
	public String getLoaiCongTy() {
		return loaiCongTy;
	}
	public void setLoaiCongTy(String loaiCongTy) {
		this.loaiCongTy = loaiCongTy;
	}

	String tinhTrang;
	public CongTy() {
		
	}
	public CongTy(String tenCty, String mSoThue, String diaChi, String tinhTrang) {
		super();
		this.tenCty = tenCty;
		this.mSoThue = mSoThue;
		this.diaChi = diaChi;
		this.tinhTrang = tinhTrang;
	}
	
	public CongTy(String tenCty, String mSoThue, String diaChi, String loaiCongTy, String tinhTrang) {
		super();
		this.tenCty = tenCty;
		this.mSoThue = mSoThue;
		this.diaChi = diaChi;
		this.loaiCongTy = loaiCongTy;
		this.tinhTrang = tinhTrang;
	}
	public String getTenCty() {
		return tenCty;
	}

	public void setTenCty(String tenCty) {
		this.tenCty = tenCty;
	}

	public String getmSoThue() {
		return mSoThue;
	}

	public void setmSoThue(String mSoThue) {
		this.mSoThue = mSoThue;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
}
