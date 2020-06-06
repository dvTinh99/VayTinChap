package controller.admin;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.bean.HoSoAdmin;
import model.bo.AdminBO;

public class ThemKhachHangServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		HttpSession session = req.getSession();
		String maNv =(String) session.getAttribute("idNhanVien");
		
		String name = convertToUTF8(req.getParameter("name"));
		String gender = req.getParameter("gender");
		String address = req.getParameter("address");
		String sdtXacNhan = req.getParameter("sdtxacnhan");
		String sohdld = req.getParameter("sohdld");
		String typeNhanLuong = req.getParameter("typenhanluong");
		String cmnd = req.getParameter("cmnd");
		String sdt = req.getParameter("sdt");
		String soshk = req.getParameter("soshk");
		String sobhyt = req.getParameter("sobhyt");
		String soTienVay = req.getParameter("sotienvay");
		String thoiHanVay = req.getParameter("thoihanvay");
		String mstcty = req.getParameter("mstcty");
		String ngay = req.getParameter("ngaylamviec");
		
		 DateFormat df1 = new SimpleDateFormat("dd/MM/yyyy");
	      String dateString1 = ngay;
	      Date date1 = null;
		try {
			date1 = df1.parse(dateString1);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	       DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
	      String dateString2 = df2.format(date1);
		String luong = req.getParameter("luong");
		//resp.getWriter().append(dateString2);
		
		
		Random r = new Random();
		String idHoSo = ""+r.nextInt(10)+r.nextInt(10)+r.nextInt(10)+r.nextInt(10)+r.nextInt(10)
		+r.nextInt(10)+r.nextInt(10)+r.nextInt(10)+r.nextInt(10)+r.nextInt(10);
		
		HoSoAdmin hoSoAdmin = new HoSoAdmin(name,cmnd,idHoSo,address,sdtXacNhan,sohdld,typeNhanLuong,
				sdt,soshk,sobhyt,soTienVay,thoiHanVay,mstcty,dateString2,luong);
		
		AdminBO adminBo = new AdminBO();
		adminBo.themKhachHang(hoSoAdmin);
		
		adminBo.nhanVienAdmin(maNv, idHoSo);
	
	}

	/**
	 * doGet: Không làm gì hết
	 * 
	 * doPost: Dựa vào form dữ liệu đã trả về insert vào CSDL
	 */
	
	String convertToUTF8 (String iso88591) {
		byte[] bytes = iso88591.getBytes(StandardCharsets.ISO_8859_1);
		iso88591 = new String(bytes, StandardCharsets.UTF_8);
		
		return iso88591;
	}
}
