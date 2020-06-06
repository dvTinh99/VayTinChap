package model.bean;

public class TieuChi {
	String tenTC;
	String alias;
	int quyen;
	boolean thamDinh;
	String thongTin;
	
	
	public TieuChi() {
		super();
	}
	
	public TieuChi(String tenTC, String alias, int quyen, boolean thamDinh, String thongTin) {
		super();
		this.tenTC = tenTC;
		this.alias = alias;
		this.quyen = quyen;
		this.thamDinh = thamDinh;
		this.thongTin = thongTin;
	}

	public boolean isThamDinh() {
		return thamDinh;
	}

	public void setThamDinh(boolean thamDinh) {
		this.thamDinh = thamDinh;
	}

	public String getThongTin() {
		return thongTin;
	}

	public void setThongTin(String data) {
		this.thongTin = data;
	}

	public String getTenTC() {
		return tenTC;
	}
	public void setTenTC(String tenTC) {
		this.tenTC = tenTC;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public int getQuyen() {
		return quyen;
	}
	public void setQuyen(int quyen) {
		this.quyen = quyen;
	}
}
