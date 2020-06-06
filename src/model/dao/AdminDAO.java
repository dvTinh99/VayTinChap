package model.dao;

import model.bean.CongTy;
import model.bean.HoSoAdmin;

public class AdminDAO {
	
	public void themKhachHang(HoSoAdmin hoSoAdmin){	
		
		ExcuteDB excuter = new ExcuteDB();
		String sql=	String.format("insert into KhachHang(Ten,CMNDKhachHang) values ('%s','%s');\r\n" + 
				"insert into HoSo(IDHoSo,CMNDKhachHang,MSThue,KhoanVayDeNghi,ThoiHanVayDeNghi,TrangThai) values ('%s','%s','%s','%s','%s','%s');\r\n" + 
				"insert into ThamDinh(IDHoSo,IDTieuChi,ThongTin) values('%s','001','%s');\r\n" + 
				"insert into ThamDinh(IDHoSo,IDTieuChi,ThongTin) values('%s','002','%s');\r\n" + 
				"insert into ThamDinh(IDHoSo,IDTieuChi,ThongTin) values('%s','003','%s');--so dang ki tren so ho khau\r\n" + 
				"insert into ThamDinh(IDHoSo,IDTieuChi,ThongTin) values('%s','004','%s');\r\n" + 
				"insert into ThamDinh(IDHoSo,IDTieuChi,ThongTin) values('%s','005','%s');--ma so thue cong ty\r\n" + 
				"insert into ThamDinh(IDHoSo,IDTieuChi,ThongTin) values('%s','007','%s');--luong\r\n" + 
				"insert into ThamDinh(IDHoSo,IDTieuChi,ThongTin) values('%s','008','%s');--hinh thuc nhan luong\r\n" + 
				"insert into ThamDinh(IDHoSo,IDTieuChi,ThongTin) values('%s','009','%s');-- hop dong lao dong\r\n" + 
				"insert into ThamDinh(IDHoSo,IDTieuChi,ThongTin) values('%s','010','%s');-- so bao hiem y te\r\n" + 
				"insert into ThamDinh(IDHoSo,IDTieuChi,ThongTin) values('%s','011','%s');--ngay lamf viec\r\n" + 
				"insert into ThamDinh(IDHoSo,IDTieuChi,ThongTin) values('%s','014','%s');--so tien vay\r\n" + 
				"insert into ThamDinh(IDHoSo,IDTieuChi,ThongTin) values('%s','015','%s');-- thoi han vay",
				hoSoAdmin.getTenKH(),hoSoAdmin.getCmnd(),
				hoSoAdmin.getIdHoSo(),hoSoAdmin.getCmnd(),hoSoAdmin.getMstcty(),hoSoAdmin.getSoTienVay(),hoSoAdmin.getThoiHanVay(),"1",
				hoSoAdmin.getIdHoSo(),hoSoAdmin.getSdt(),
				hoSoAdmin.getIdHoSo(),hoSoAdmin.getAddress(),
				hoSoAdmin.getIdHoSo(),hoSoAdmin.getSoshk(),
				hoSoAdmin.getIdHoSo(),hoSoAdmin.getSdtXacNhan(),
				hoSoAdmin.getIdHoSo(),hoSoAdmin.getMstcty(),
				hoSoAdmin.getIdHoSo(),hoSoAdmin.getLuong(),
				hoSoAdmin.getIdHoSo(),hoSoAdmin.getTypeNhanLuong(),
				hoSoAdmin.getIdHoSo(),hoSoAdmin.getSohdld(),
				hoSoAdmin.getIdHoSo(),hoSoAdmin.getSobhyt(),
				hoSoAdmin.getIdHoSo(),hoSoAdmin.getNgayLamViec(),
				hoSoAdmin.getIdHoSo(),hoSoAdmin.getSoTienVay(),
				hoSoAdmin.getIdHoSo(),hoSoAdmin.getThoiHanVay());
		
		System.out.println(sql);
	 excuter.executeUpdate(sql);
		
	}
	public void themCongTy(CongTy congTy) {
		ExcuteDB excuter = new ExcuteDB();
		String sql=	String.format("insert into CongTy(TenCongTy,MsThue,DiaChi,TrangThai,Note) \r\n" + 
				"values('%s','%s','%s','%s','%s')",
				congTy.getTenCty(),congTy.getmSoThue(),congTy.getDiaChi(),congTy.getLoaiCongTy(),congTy.getTinhTrang());
		
		System.out.println(sql);
	 excuter.executeUpdate(sql);
	}
	
	public void nhanVienAdmin(String maNv, String idHoSo) {
		ExcuteDB excuter = new ExcuteDB();
		String sql1 = String.format("update HoSo \r\n" + 
				"  set MaNVAdmin = '%s'\r\n" + 
				"  where IDHoSo = '%s' ", maNv,idHoSo);
		System.out.println(sql1);
		excuter.executeUpdate(sql1);
	}
	
}
