package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.bean.HoSoCV;
import model.bean.HoSoRO;
import model.bean.TieuChi;

public class RODAO {
	
public  List<TieuChi> listTieuChi(String idHoSo){
		
		ExcuteDB excuter = new ExcuteDB();
		
		List<TieuChi> list = new ArrayList<TieuChi>();
		
		String sql=	String.format("select TenTieuChi,Alias,Quyen,ThongTin,KQThamDinh from  \r\n" + 
				"	TieuChi inner join ThamDinh \r\n" + 
				"	on TieuChi.IDTieuChi = ThamDinh.IDTieuChi \r\n" + 
				"	where ThamDinh.IDHoSo = '%s'", idHoSo);
		ResultSet rs = excuter.executeQuery(sql);
		try {
			while(rs.next()){
				TieuChi tc = new TieuChi();
				tc.setTenTC(rs.getString("TenTieuChi"));
				tc.setAlias(rs.getString("Alias"));
				tc.setQuyen(rs.getInt("Quyen"));
				tc.setThongTin(rs.getString("ThongTin"));
				tc.setThamDinh(rs.getBoolean("KQThamDinh"));
				list.add(tc);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list ;
		
	}
	
	public List<HoSoRO> dsHS(){
		List<HoSoRO> list = new ArrayList<HoSoRO>();
		
		ExcuteDB excuter = new ExcuteDB();
		String sql=	String.format("select IDHoSo, Ten,KhachHang.CMNDKhachHang,NgaySinh,GioiTinh,LichSuRO,GhiChu,TrangThai " + 
				"from KhachHang " + 
				"inner join HoSo " + 
				"on KhachHang.CMNDKhachHang = HoSo.CMNDKhachHang " +
				"where HoSo.TrangThai = 4 or HoSo.TrangThai = 5 or HoSo.TrangThai = 6");
		ResultSet rs = excuter.executeQuery(sql);
		
		try {
			while(rs.next()){
				HoSoRO hoSoCv = new HoSoRO();
				hoSoCv.setIdHoSo(rs.getString("IDHoSo"));
				hoSoCv.setTenKH(rs.getString("Ten"));
				hoSoCv.setCmnd(rs.getString("CMNDKhachHang"));
				hoSoCv.setTinhTrang(rs.getString("TrangThai"));
				hoSoCv.setLichSuRO(rs.getString("LichSuRO"));
				Date date = rs.getDate("NgaySinh");
				hoSoCv.setNgaySinh(date);
				if (rs.getInt("GioiTinh")==0) {
					hoSoCv.setGioiTinh(false);
				} else {
					hoSoCv.setGioiTinh(true);
				}
				List<TieuChi> tieuChi = new RODAO().listTieuChi(rs.getString("IDHoSo"));
				hoSoCv.setList(tieuChi);
				list.add(hoSoCv);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list ;
	}

}
