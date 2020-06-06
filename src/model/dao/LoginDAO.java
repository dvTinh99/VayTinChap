package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.bean.HoSoIV;

public class LoginDAO {
	
	public String kiemTraLogin(String user, String pass) {
		String chucVu ="" ;
		int maChucVu = 0 ;
		String maNhanVien ="" ;
		ExcuteDB excuter = new ExcuteDB();
		String sql=	String.format("select MaNhanVien,MaChucVu from NhanVien where Alias = '%s' and Pass = '%s'",user,pass);
		ResultSet rs = excuter.executeQuery(sql);
		
		try {
			while(rs.next()){
				 maChucVu = rs.getInt("MaChucVu");
				 maNhanVien = rs.getString("MaNhanVien");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		switch (maChucVu) {
		case 1:
			chucVu = "sale";
			break;
		case 2:
			chucVu = "admin";
			break;
		case 3:
			chucVu = "cv";
			break;
		case 4:
			chucVu = "fv";
			break;
		case 5 :
			chucVu = "iv";
			break ;
		case 6 :
			chucVu = "ro";
			break;

		}
		return chucVu+"/"+maNhanVien;
	}

}
