
package model.bo;

import java.util.List;

import model.bean.HoSoRO;
import model.dao.RODAO;

public class ROBO {
	
	RODAO roDao = new RODAO();
	public List<HoSoRO> dsHs(){
		return roDao.dsHS();
	}

}
