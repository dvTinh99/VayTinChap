package controller.ro;

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

public class ROInterfaceServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ROInterfaceServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		/**
		 * Trả về giao diện cho người dùng
		 */
		HttpSession session = req.getSession();
		String chucVu =(String) session.getAttribute("chucVu");
		
		System.out.println(chucVu + " sale");
		
		if (chucVu == null || !chucVu.equals("ro")) {
			resp.sendRedirect("./login");
			return;
		}
		
			RequestDispatcher rd = req.getRequestDispatcher("./ROOffice/ro.jsp");
			req.setAttribute(Variable.TYPE_OF_USER, TypeOfUser.RO);
			req.setAttribute(Variable.THE_JSFILE_HANDLE, JSFiles.RO_HANDLE);
			req.setAttribute(Variable.THE_JSFILE_INTERFACE, JSFiles.RO_INTERFACE);
			rd.forward(req, resp);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/**
		 * Không làm gì cả
		 */
	}
}
