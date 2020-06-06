package model.bo;

import java.util.List;

import model.bean.HoSoCV;
import model.bean.TieuChi;
import model.dao.CVDAO;
import model.dao.ExcuteDB;

public class CVBO {
	
	CVDAO cvDao = new CVDAO();
	
	public List<HoSoCV> dsHS(){
		return cvDao.dsHS();
	}
	public  List<TieuChi> listAllTenTieuChi(){
		return cvDao.listAllTenTieuChi();
	}
	public void ThamDinh(String val, String idHoSo,String idTieuChi) {
		 cvDao.ThamDinh(val, idHoSo, idTieuChi);
	}
	public void ChuyenFV(String idHoSo) {
		cvDao.ChuyenFV(idHoSo);
	}
	public void DanhRot(String IDHoSo,String status) {
		cvDao.DanhRot(IDHoSo, status);
	}
	public void nhanVienCv(String maNv, String idHoSo) {
		cvDao.nhanVienCv(maNv, idHoSo);
	}
	
}
