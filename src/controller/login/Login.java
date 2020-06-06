package controller.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.bo.LoginBO;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		HttpSession session = request.getSession();
		String chucVu =(String) session.getAttribute("chucVu");
		
		System.out.println(chucVu + " login");
		
		if (chucVu == null) {
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			rd.forward(request, response);
		} else {
			switch (chucVu) {
			case "sale":
				response.sendRedirect("homesale");
				break;
			case "admin": 
				response.sendRedirect("homeadmin");
				break;
			case "cv": 
				response.sendRedirect("homecv");
				break;
			case "fv" : 
				response.sendRedirect("homefv");
				break;
			case "iv" : 
				response.sendRedirect("homeiv");
				break ;
			case "ro" : 
				response.sendRedirect("homero");
				break ;
			}
		}

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String user = request.getParameter("username");
		String pass = request.getParameter("pass");
		
		
		
		LoginBO loginBo = new LoginBO();
		String login = loginBo.kiemTraLogin(user, pass);
	//	response.getWriter().append(chucVu);
		String dangNhap[] = login.split("/");
		String chucVu = dangNhap[0];
		String idNhanVien = dangNhap[1];
		

		session.setAttribute("idNhanVien", idNhanVien);
		session.setAttribute("chucVu", chucVu);
		
		switch (chucVu) {
		case "sale":
			response.sendRedirect("homesale");
			break;
		case "admin": 
			response.sendRedirect("homeadmin");
			break;
		case "cv": 
			response.sendRedirect("homecv");
			break;
		case "fv" : 
			response.sendRedirect("homefv");
			break;
		case "iv" : 
			response.sendRedirect("homeiv");
			break ;
		case "ro" : 
			response.sendRedirect("homero");
			break ;
		}
		
	}

}
