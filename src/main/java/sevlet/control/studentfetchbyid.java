package sevlet.control;

	import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
	import javax.servlet.ServletException;
	import javax.servlet.ServletRequest;
	import javax.servlet.ServletResponse;
	import javax.servlet.annotation.WebServlet;

import servlet.Dto.studentDto;
import servletcrud.dao.Studentdao;


	@WebServlet("/fetchbyid")
	public class studentfetchbyid extends GenericServlet {

		@Override
		public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
			String id=req.getParameter("sid");
			int sid=Integer.parseInt(id);	
			
			Studentdao dao= new Studentdao();
			studentDto d1=dao.fetch(sid);
			res.getWriter().print(d1);			
				
		}

	}


