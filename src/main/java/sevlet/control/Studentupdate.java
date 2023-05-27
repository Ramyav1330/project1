package sevlet.control;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import servlet.Dto.studentDto;
import servletcrud.dao.Studentdao;
@WebServlet("/update")
public class Studentupdate extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String id=req.getParameter("sid");
		int sid=Integer.parseInt(id);	
		String phono= req.getParameter("phno");
		long num = Long.parseLong(phono);		
		
		Studentdao studentdao= new Studentdao();
		studentdao.update(sid,num);
		
		studentDto dto=new studentDto();		
	}

	
}
