package controller.sale;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import common.JSFiles;
import common.TypeOfUser;
import common.Variable;
import model.bean.HoSoKhachHang;
import model.bo.SaleBO;

/**
 * Servlet implementation class ThongTinCongTyServlet
 */
//@WebServlet("/ThongTinCongTyServlet")
public class HomeSaleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeSaleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		/**
		 * Trả về giao diện cho người dùng
		 */
		HttpSession session = req.getSession();
		String chucVu =(String) session.getAttribute("chucVu");
		
		System.out.println(chucVu + " sale");
		
		if (chucVu == null || !chucVu.equals("sale")) {
			resp.sendRedirect("./login");
			return;
		}
		
		RequestDispatcher rd = req.getRequestDispatcher("sale.jsp");
		req.setAttribute(Variable.TYPE_OF_USER, TypeOfUser.SALE_PERSONAL);
		req.setAttribute(Variable.THE_JSFILE_HANDLE, JSFiles.SALE_HANDLE);
		req.setAttribute(Variable.THE_JSFILE_INTERFACE, JSFiles.SALE_INTERFACE);
		rd.forward(req, resp);
		
	}

	/*
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/**
		 * Trả về thông tin công ty or thông tin khách hàng
		 * 		Nhớ rõ là thông tin (của 1 bộ hồ sơ) không phải danh sách 
		 * 		Chú ý: dựa vào typeofsubmit mà trả về danh sách tương ứng
		 * 		nếu không có thông tin trả không tìm thấy
		 */
		String typeofsubmit = request.getParameter("typeofsubmit");
		
			
			String tenKhachHang = (String) request.getAttribute("ten");
			String ngaySinh = (String) request.getAttribute("ngaysinh");
			String cmnd = (String) request.getAttribute("socmnd");
			HoSoKhachHang khachHang = new HoSoKhachHang();
			khachHang.setTenKH(tenKhachHang);
			khachHang.setCmnd(cmnd);
			khachHang.setNgaysinhStr(ngaySinh);
		
			SaleBO saleBo = new SaleBO();
			List<HoSoKhachHang> list ;
			list = saleBo.TimKiemKhachHang(khachHang);
			
			Gson gson = new Gson();
			String json = gson.toJson(list);
			response.getWriter().write(json);
		
	}

}
