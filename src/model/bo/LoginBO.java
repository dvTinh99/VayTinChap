package model.bo;

import model.dao.LoginDAO;

public class LoginBO {
	LoginDAO loginDao = new LoginDAO();
	public String kiemTraLogin(String user, String pass) {
		return loginDao.kiemTraLogin(user, pass);
	}

}
