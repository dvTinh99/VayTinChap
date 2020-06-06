package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.bean.HoSoCV;
import model.bean.HoSoFV;
import model.bean.TieuChi;

public class FVDAO {

public  List<TieuChi> listTieuChi(String idHoSo){
		
		ExcuteDB excuter = new ExcuteDB();
		
		List<TieuChi> list = new ArrayList<TieuChi>();
		
		String sql=	String.format("select TenTieuChi,Alias,Quyen,ThongTin,KQThamDinh from  TieuChi "
				+ "inner join ThamDinh on TieuChi.IDTieuChi = ThamDinh.IDTieuChi "
				+ "where IDHoSo = %s and (TieuChi.Quyen = 1 or Quyen = 2)", idHoSo);
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
	
	public List<HoSoFV> dsHS(){
		List<HoSoFV> list = new ArrayList<HoSoFV>();
		
		ExcuteDB excuter = new ExcuteDB();
		String sql=	String.format("select IDHoSo, Ten,KhachHang.CMNDKhachHang,NgaySinh,GioiTinh,LichSuCV,GhiChu,TrangThai " + 
				"from KhachHang " + 
				"inner join HoSo " + 
				"on KhachHang.CMNDKhachHang = HoSo.CMNDKhachHang " +
				"where HoSo.TrangThai = 2 or HoSo.TrangThai = 3");
		ResultSet rs = excuter.executeQuery(sql);
		
		try {
			while(rs.next()){
				HoSoFV hoSoCv = new HoSoFV();
				hoSoCv.setIdHoSo(rs.getString("IDHoSo"));
				hoSoCv.setTenKH(rs.getString("Ten"));
				hoSoCv.setCmnd(rs.getString("CMNDKhachHang"));
				Date date = rs.getDate("NgaySinh");
				hoSoCv.setNgaySinh(date);
				if (rs.getInt("GioiTinh")==0) {
					hoSoCv.setGioiTinh(false);
				} else {
					hoSoCv.setGioiTinh(true);
				}
				hoSoCv.setLichSuGoi(rs.getString("LichSuCV"));
				hoSoCv.setNoteTinhTrang(rs.getString("GhiChu"));
				hoSoCv.setTrangThai(rs.getInt("TrangThai"));
				List<TieuChi> tieuChi = new CVDAO().listTieuChi(rs.getString("IDHoSo"));
				hoSoCv.setList(tieuChi);
				list.add(hoSoCv);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list ;
	}
public  List<TieuChi> listAllTenTieuChi(){
		
		ExcuteDB excuter = new ExcuteDB();
		
		List<TieuChi> list = new ArrayList<TieuChi>();
		
		String sql=	String.format("select IDTieuChi,Alias from TieuChi where Quyen= 1 or Quyen= 2");
		ResultSet rs = excuter.executeQuery(sql);
		try {
			while(rs.next()){
				TieuChi tc = new TieuChi();
				tc.setTenTC(rs.getString("IDTieuChi"));
				tc.setAlias(rs.getString("Alias"));
				list.add(tc);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list ;
		
	}


	
	public void ThamDinh(String val, String idHoSo,String idTieuChi) {
		
		ExcuteDB excuter = new ExcuteDB();
		
		String sql=	String.format("update ThamDinh set KQThamDinh = '%s' where IDHoSo = '%s' and IDTieuChi ='%s'",val,idHoSo,idTieuChi);
		
		System.out.println(sql);
	 excuter.executeUpdate(sql);
		
	}
	public void ChuyenTrangThai(String idHoSo) {
		ExcuteDB excuter = new ExcuteDB();
		String sql1 = String.format("update HoSo set TrangThai = '3' where IDHoSo = '%s'", idHoSo);

		excuter.executeUpdate(sql1);
	}
	public void ChuyenFV(String idHoSo) {
		ExcuteDB excuter = new ExcuteDB();
		String sql1 = String.format("update HoSo set TrangThai = '3' where IDHoSo = '%s'", idHoSo);

		excuter.executeUpdate(sql1);
	}
	public void DanhRot(String idHoSo,String status) {
		ExcuteDB excuter = new ExcuteDB();
		String sql1 = String.format("update HoSo set TrangThai = '6' where IDHoSo = '%s';"
				+ "update HoSo set GhiChu = '%s' where IDHoSo = '%s'", idHoSo,status,idHoSo);
		excuter.executeUpdate(sql1);
	}

}
