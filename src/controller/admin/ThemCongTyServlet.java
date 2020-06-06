package controller.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.CongTy;
import model.bo.AdminBO;

public class ThemCongTyServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		
		String name = (String)req.getParameter("name");
		String mst = (String)req.getParameter("mst");
		String address = (String) req.getParameter("address");
		String type = (String)req.getParameter("type");
		switch(type) {
		case "1": type = "PS" ; break;
		case "2": type = "NON PS" ; break;
		case "3": type = "Black list" ; break;
		}
		String tinhTrang = (String)req.getParameter("ghichu");
		
		
		CongTy congTy = new CongTy(name,mst,address,type,tinhTrang);
		AdminBO adminBo = new AdminBO();
		
		adminBo.themCongTy(congTy);
		
		
		
	}

	/**
	 * doGet: Không làm gì hết
	 * 
	 * doPost: Dựa vào form dữ liệu đã trả về insert vào CSDL
	 */
	
	
}
