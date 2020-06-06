package controller.iv;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import model.bean.HoSoIV;
import model.bo.IVBO;

public class HoSoThamDinhIVServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<HoSoIV> list ;
		IVBO ivBo = new IVBO();
		list = ivBo.dsHs();
		
		System.out.println("some things ");
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
	 * doGet: Trả về danh sách hồ sơ đang IV và đã Iv dưới dạng JSON
	 * 		Nhớ là cả thông tin thẩm định đúng or sai
	 * 
	 * doPost: Nhận thông tin đã thẩm định và insert vào CSDL
	 * 		Chú ý: kiểm tra xem người dùng lưu hay chuyển tới bộ phận tiếp theo
	 * 		Sau khi xong redirect người dùng về trang homeiv, đảm bảo khi F5 không hiện lại form xác nhận resubmit
	 */

	
}
