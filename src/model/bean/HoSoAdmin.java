package model.bean;

public class HoSoAdmin extends HoSoKhachHang{

	String idHoSo ;
	String address ;
	String sdtXacNhan ;
	String sohdld ;
	String typeNhanLuong ;
	String sdt ;
	String soshk ;
	String sobhyt ;
	String soTienVay ;
	String thoiHanVay ;
	String mstcty ;
	String ngayLamViec ;
	String luong ;
	
	public HoSoAdmin() {
		
	}

	public HoSoAdmin(String tenKhachHang,String cmnd ,String idHoSo, String address, String sdtXacNhan, String sohdld, String typeNhanLuong, String sdt,
			String soshk, String sobhyt, String soTienVay, String thoiHanVay, String mstcty, String ngayLamViec,
			String luong) {
		super();
		this.idHoSo = idHoSo;
		this.address = address;
		this.sdtXacNhan = sdtXacNhan;
		this.sohdld = sohdld;
		this.typeNhanLuong = typeNhanLuong;
		this.sdt = sdt;
		this.soshk = soshk;
		this.sobhyt = sobhyt;
		this.soTienVay = soTienVay;
		this.thoiHanVay = thoiHanVay;
		this.mstcty = mstcty;
		this.ngayLamViec = ngayLamViec;
		this.luong = luong;
		this.tenKH = tenKhachHang;
		this.cmnd = cmnd ;
	}

	public String getIdHoSo() {
		return idHoSo;
	}

	public void setIdHoSo(String idHoSo) {
		this.idHoSo = idHoSo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSdtXacNhan() {
		return sdtXacNhan;
	}

	public void setSdtXacNhan(String sdtXacNhan) {
		this.sdtXacNhan = sdtXacNhan;
	}

	public String getSohdld() {
		return sohdld;
	}

	public void setSohdld(String sohdld) {
		this.sohdld = sohdld;
	}

	public String getTypeNhanLuong() {
		return typeNhanLuong;
	}

	public void setTypeNhanLuong(String typeNhanLuong) {
		this.typeNhanLuong = typeNhanLuong;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getSoshk() {
		return soshk;
	}

	public void setSoshk(String soshk) {
		this.soshk = soshk;
	}

	public String getSobhyt() {
		return sobhyt;
	}

	public void setSobhyt(String sobhyt) {
		this.sobhyt = sobhyt;
	}

	public String getSoTienVay() {
		return soTienVay;
	}

	public void setSoTienVay(String soTienVay) {
		this.soTienVay = soTienVay;
	}

	public String getThoiHanVay() {
		return thoiHanVay;
	}

	public void setThoiHanVay(String thoiHanVay) {
		this.thoiHanVay = thoiHanVay;
	}

	public String getMstcty() {
		return mstcty;
	}

	public void setMstcty(String mstcty) {
		this.mstcty = mstcty;
	}

	public String getNgayLamViec() {
		return ngayLamViec;
	}

	public void setNgayLamViec(String ngayLamViec) {
		this.ngayLamViec = ngayLamViec;
	}

	public String getLuong() {
		return luong;
	}

	public void setLuong(String luong) {
		this.luong = luong;
	}
	
	
}
