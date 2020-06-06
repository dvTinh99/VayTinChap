package model.bo;

import model.bean.CongTy;
import model.bean.HoSoAdmin;
import model.dao.AdminDAO;

public class AdminBO {
	
	AdminDAO adminDao = new AdminDAO();
	public void themKhachHang(HoSoAdmin hoSoAdmin) {
		adminDao.themKhachHang(hoSoAdmin);
	}
	public void themCongTy(CongTy congTy) {
		adminDao.themCongTy(congTy);
	}
	public void nhanVienAdmin(String maNv, String idHoSo) {
		adminDao.nhanVienAdmin(maNv, idHoSo);
	}
	
}
