package model.bo;

import java.util.List;

import model.bean.HoSoFV;
import model.bean.TieuChi;
import model.dao.FVDAO;

public class FVBO {
	FVDAO fvDao = new FVDAO();
	public List<HoSoFV> dsHs(){
		return fvDao.dsHS();
	}
	public  List<TieuChi> listAllTenTieuChi(){
		return fvDao.listAllTenTieuChi();
	}
	public void ThamDinh(String val, String idHoSo,String idTieuChi) {
		fvDao.ThamDinh(val, idHoSo, idTieuChi);
	}
	public void ChuyenIV(String idHoSo) {
		fvDao.ChuyenFV(idHoSo);
	}
	public void DanhRot(String IDHoSo,String status) {
		fvDao.DanhRot(IDHoSo, status);
	}
	
}
