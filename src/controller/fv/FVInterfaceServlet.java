package controller.fv;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import common.JSFiles;
import common.TypeOfUser;
import common.Variable;
import model.bean.HoSoFV;
import model.bo.FVBO;

/**
 * Servlet implementation class DanhSachHoSoFVServlet
 */
//@WebServlet("/DanhSachHoSoFVServlet")
public class FVInterfaceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FVInterfaceServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/**
		 *	Trả về giao diện cho người dùng 
		 */
		HttpSession session = req.getSession();
		String chucVu =(String) session.getAttribute("chucVu");
		
		System.out.println(chucVu + " sale");
		
		if (chucVu == null || !chucVu.equals("fv")) {
			resp.sendRedirect("./login");
			return;
		}
		
			RequestDispatcher rd = req.getRequestDispatcher("./FVOffice/fv.jsp");
			req.setAttribute(Variable.TYPE_OF_USER, TypeOfUser.FV);
			req.setAttribute(Variable.THE_JSFILE_HANDLE, JSFiles.FV_HANDLE);
			req.setAttribute(Variable.THE_JSFILE_INTERFACE, JSFiles.FV_INTERFACE);
			rd.forward(req, resp);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		FVBO fvBo = new FVBO();
//		List<HoSoFV> list ;
//		list = fvBo.dsHs();
//		System.out.println("some things");
		
		/**
		 * Không làm gì cả
		 */
		
	}

}
