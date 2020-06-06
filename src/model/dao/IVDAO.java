package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.tomcat.jni.Local;

import model.bean.HoSoIV;

public class IVDAO {
	
	ExcuteDB excuter = new ExcuteDB();

public List<HoSoIV> dsHS(){
	List<HoSoIV> list = new ArrayList<HoSoIV>();
	
	ExcuteDB excuter = new ExcuteDB();
	String sql=	String.format("select DISTINCT Ten,KhachHang.CMNDKhachHang,GioiTinh,NgaySinh, HoSo.IDHoSo,HoSo.TrangThai,\r\n" + 
			"	(SELECT ThamDinh.ThongTin FROM ThamDinh WHERE ThamDinh.IDTieuChi = '001' AND HoSo.IDHoSo = ThamDinh.IDHoSo) AS SDT,\r\n" + 
			"	(SELECT ThamDinh.ThongTin FROM ThamDinh WHERE ThamDinh.IDTieuChi = '002' AND HoSo.IDHoSo = ThamDinh.IDHoSo) AS DiaChi\r\n" + 
			"from HoSo inner join KhachHang\r\n" + 
			"	on HoSo.CMNDKhachHang = KhachHang.CMNDKhachHang	");
	ResultSet rs = excuter.executeQuery(sql);
	
	try {
		while(rs.next()){
			HoSoIV hoSoCv = new HoSoIV();
			hoSoCv.setTenKH(rs.getString("Ten"));
			hoSoCv.setCmnd(rs.getString("CMNDKhachHang"));
			hoSoCv.setGioiTinh(rs.getString("GioiTinh") == "1" ? true : false);
			String ngaySinh = rs.getString("NgaySinh");
			String ngay = "1999/11/20" ;
			String dateString2 = "" ;
			Date date1 = null;
			if (ngaySinh != null ) {
				ngay = ngaySinh ;
				DateFormat df1 = new SimpleDateFormat("yyyy/MM/dd");
			      String dateString1 = ngay;
				try {
					date1 = df1.parse(dateString1);
				} catch (ParseException e) {
					e.printStackTrace();
				}
			      final DateFormat df2 = new SimpleDateFormat("dd/MM/yyyy");
			       dateString2 = df2.format(date1);
			}  else {
				DateFormat df1 = new SimpleDateFormat("yyyy/MM/dd");
			      String dateString1 = ngay;
				try {
					date1 = df1.parse(dateString1);
				} catch (ParseException e) {
					e.printStackTrace();
				}
			      final DateFormat df2 = new SimpleDateFormat("dd/MM/yyyy");
			       dateString2 = df2.format(date1);
			}
			
			
			hoSoCv.setNgaysinhStr(dateString2);
			hoSoCv.setIdHoSo(rs.getString("IDHoSo"));
			hoSoCv.setSdt(rs.getString("SDT"));
			hoSoCv.setDiaChi(rs.getString("DiaChi"));
			hoSoCv.setTrangThai(rs.getInt("TrangThai"));
			list.add(hoSoCv);
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	return list ;
}

}
