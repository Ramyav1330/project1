package sevlet.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.Dto.studentDto;
import servletcrud.dao.Studentdao;
@WebServlet("/fetchall")

public class fetchAll extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		//super.doGet(req, resp);
		Studentdao dao = new Studentdao();
		List<studentDto> list=dao.fetchall();
		req.setAttribute("studentlist", list);
		
		RequestDispatcher rd= req.getRequestDispatcher("download.jsp");
		rd.forward(req, resp);
		
			
//		for(studentDto a:list) {
//			resp.getWriter().print(a.getStd_id());
//			resp.getWriter().print(a.getPhnno());
//			resp.getWriter().print(a.getGender());
//			resp.getWriter().print(a.getStd_name());
//		}
		
	
	}	
}
	
	
