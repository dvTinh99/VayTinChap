package controller.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import common.JSFiles;
import common.TypeOfUser;
import common.Variable;

public class AdminInterface extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AdminInterface() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		/**
		 * Trả về giao diện cho người dùng
		 */
		HttpSession session = req.getSession();
		String chucVu =(String) session.getAttribute("chucVu");
		
		//System.out.println(chucVu + " sale");
		
		if (chucVu == null || !chucVu.equals("admin")) {
			resp.sendRedirect("./login");
			return;
		}
		
			RequestDispatcher rd = req.getRequestDispatcher("./AdminOffice/admininterface.jsp");
			req.setAttribute(Variable.TYPE_OF_USER, TypeOfUser.IV);
			req.setAttribute(Variable.THE_JSFILE_HANDLE, JSFiles.IV_HANDLE);
			req.setAttribute(Variable.THE_JSFILE_INTERFACE, JSFiles.IV_INTERFACE);
			rd.forward(req, resp);
		
		
	}
		
		

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		/**
		 * Không làm gì cả
		 */
		
		super.doPost(req, resp);
	}
	
	
}
