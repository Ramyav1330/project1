package sevlet.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servletcrud.dao.Studentdao;

@WebServlet("/delete")
public class Studentdelete extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	super.doGet(req, resp);
		
		
		String id=req.getParameter("id");
		int cid=Integer.parseInt(id);
		
		
		Studentdao dao= new Studentdao();
		dao.delete1(cid);
	}

	
	
	
}
