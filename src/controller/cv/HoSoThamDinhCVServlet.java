package controller.cv;

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
import model.bean.HoSoCV;
import model.bean.ThamDinh;
import model.bean.TieuChi;
import model.bo.CVBO;

public class HoSoThamDinhCVServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<HoSoCV> list ;
		
		CVBO cvBo = new CVBO();
		list = cvBo.dsHS();
		
		Gson gson = new Gson();
		String json = gson.toJson(list);
		resp.getWriter().write(json);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		CVBO cvBo = new CVBO();
		
		String idHoSo = req.getParameter("idHoSo"); 
		String submit = req.getParameter("submit");
		HttpSession session = req.getSession();
		List<TieuChi> listAllTenTieuChi = cvBo.listAllTenTieuChi();
		int listSize = listAllTenTieuChi.size();

		for (int i = 0; i < listSize; i++) {
			TieuChi tieuchi = listAllTenTieuChi.get(i);
			String val = req.getParameter(tieuchi.getAlias());
			cvBo.ThamDinh(val, idHoSo, tieuchi.getTenTC());
		}
		String idNhanVien =(String) session.getAttribute("idNhanVien");
//		System.out.println(idNhanVien);
		cvBo.nhanVienCv(idNhanVien, idHoSo);
		switch(submit) {
			case "reject" :
				String status = req.getParameter("status");
				cvBo.DanhRot(idHoSo, status);
				break;
			case "success":
				cvBo.ChuyenFV(idHoSo);
				break;
			case "save":
				break;
			default:
				System.out.println("ko dc");
				break;
		}

		resp.sendRedirect("./homecv");
		
	}
	/**
	 * doGet: Trả về danh sách hồ sơ đang CV và đã cv dưới dạng JSON
	 * 		Nhớ là cả thông tin thẩm định đúng or sai
	 * 
	 * doPost: Nhận thông tin đã thẩm địn	h và insert vào CSDL
	 * 		Chú ý: kiểm tra xem người dùng lưu hay chuyển tới bộ phận tiếp theo
	 * 		Sau khi xong redirect người dùng về trang homecv, đảm bảo khi F5 không hiện lại form xác nhận resubmit
	 */
	
	
}
