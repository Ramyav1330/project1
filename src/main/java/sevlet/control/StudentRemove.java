package sevlet.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import servlet.Dto.studentDto;
import servletcrud.dao.Studentdao;


@WebServlet("/remove")
public class StudentRemove extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	String s1=	req.getParameter("sid");
		int a=Integer.parseInt(s1);
		Studentdao s =new Studentdao();
		
		String msg=s.delete(a);
		
		
		
		List<studentDto> list= s.fetchall();
		
	req.setAttribute("studentlist", list);
	res.getWriter().print(msg);
	RequestDispatcher rd=req.getRequestDispatcher("download.jsp");
	rd.include(req, res);
		
	}
	
	
	
}
