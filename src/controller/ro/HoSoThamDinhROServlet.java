package controller.ro;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import model.bean.HoSoRO;
import model.bo.ROBO;

public class HoSoThamDinhROServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<HoSoRO> list ;
		ROBO roBo = new ROBO() ;
		
		list = roBo.dsHs();
		
		System.out.println("some things");
		
		Gson gson = new Gson();
		String json = gson.toJson(list);
		resp.getWriter().write(json);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

	/**
	 * doGet: Trả về danh sách hồ sơ đang RO và đã RO dưới dạng JSON
	 * 		Nhớ là cả thông tin thẩm định đúng or sai
	 * 
	 * doPost: Nhận thông tin đã thẩm định và insert vào CSDL
	 * 		Chú ý: kiểm tra xem người dùng lưu hay chuyển tới bộ phận tiếp theo
	 * 		Sau khi xong redirect người dùng về trang homero, đảm bảo khi F5 không hiện lại form xác nhận resubmit
	 */
	
	
}
