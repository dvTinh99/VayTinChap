package model.bo;

import java.util.List;

import model.bean.HoSoIV;
import model.dao.IVDAO;

public class IVBO {
	IVDAO ivDao = new IVDAO() ;
	public List<HoSoIV> dsHs(){
		return ivDao.dsHS();
		
	}
}
