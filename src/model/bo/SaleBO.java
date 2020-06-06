package model.bo;

import java.util.List;

import model.bean.CongTy;
import model.bean.HoSoKhachHang;
import model.dao.SaleDAO;

public class SaleBO {
	SaleDAO saleDao = new SaleDAO();
	
	public List<CongTy> thongTinCT(){
		return saleDao.thongTinCT();
	}
	public List<HoSoKhachHang> hoSoKhachHang(){
		return saleDao.hoSoKhachHang();
	}
	public List<HoSoKhachHang> TimKiemKhachHang(HoSoKhachHang hsKH) {
		return saleDao.TimKiemKhachHang(hsKH);
	}

}
