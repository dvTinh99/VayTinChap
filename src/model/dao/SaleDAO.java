package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.bean.CongTy;
import model.bean.HoSoKhachHang;

public class SaleDAO {
	ExcuteDB connect = new ExcuteDB();
	
	public List<CongTy> thongTinCT(){
		List<CongTy> list = new ArrayList<>();
		ExcuteDB excuter = new ExcuteDB();
		String sql=	String.format("select TenCongTy,MsThue,DiaChi,TrangThai from CongTy");
		ResultSet rs = excuter.executeQuery(sql);
		try {
			while(rs.next()){
				CongTy ct = new CongTy();
				ct.setTenCty(rs.getString("TenCongTy"));
				ct.setmSoThue(rs.getString("MsThue"));
				ct.setDiaChi(rs.getString("DiaChi"));
				ct.setTinhTrang(rs.getString("TrangThai"));
				
				list.add(ct);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return list;
	}
	
	public List<HoSoKhachHang> hoSoKhachHang(){
		List<HoSoKhachHang> list = new ArrayList<>();
		ExcuteDB excuter = new ExcuteDB();
		String sql=	String.format("select CMNDKhachHang,Ten,NgaySinh,GioiTinh\n" + 
				"from KhachHang");
		ResultSet rs = excuter.executeQuery(sql);
		try {
			while(rs.next()){
				HoSoKhachHang hskh = new HoSoKhachHang();
				hskh.setCmnd(rs.getString("CMNDKhachHang"));
				hskh.setTenKH(rs.getString("Ten"));
				SimpleDateFormat ft = new SimpleDateFormat ("yyyy.MM.dd");
				Date date = rs.getDate("NgaySinh");
				
				hskh.setNgaySinh(date);
				if (rs.getInt("GioiTinh")==1) {
					hskh.setGioiTinh(true);
				}else {
					hskh.setGioiTinh(false);
				}
				
				
				list.add(hskh);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return list;
	}
	public List<HoSoKhachHang> TimKiemKhachHang(HoSoKhachHang hsKH) {
		
		List<HoSoKhachHang> list = new ArrayList<>();
		ExcuteDB excuter = new ExcuteDB();
		String sql=	String.format("select KhachHang.CMNDKhachHang,KhachHang.Ten,HoSo.TrangThai,HoSo.GhiChu\r\n" + 
				"	 from KhachHang inner join HoSo \r\n" + 
				"	 on KhachHang.CMNDKhachHang = HoSo.CMNDKhachHang\r\n" + 
				"	 where KhachHang.Ten like '' or KhachHang.NgaySinh like '' or KhachHang.CMNDKhachHang like '' ;"
				,hsKH.getTenKH(),hsKH.getNgaysinhStr(),hsKH.getCmnd());
		ResultSet rs = excuter.executeQuery(sql);
		try {
			while(rs.next()){
				HoSoKhachHang hskh = new HoSoKhachHang();
				hskh.setCmnd(rs.getString("CMNDKhachHang"));
				hskh.setTenKH(rs.getString("Ten"));
				hskh.setNgaysinhStr(rs.getString("NgaySinh"));
				hskh.setTinhTrang(rs.getString("TrangThai"));
				hskh.setGhiChu(rs.getString("GhiChu"));
				
				if (rs.getInt("GioiTinh")==1) {
					hskh.setGioiTinh(true);
				}else {
					hskh.setGioiTinh(false);
				}
				
				
				list.add(hskh);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return list;
	}


}
