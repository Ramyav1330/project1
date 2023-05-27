package sevlet.control;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import servlet.Dto.studentDto;
import servletcrud.dao.Studentdao;

@WebServlet("/insert")
public class Studentcontroller extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String id=req.getParameter("sid");
		String id1=req.getParameter("sname");
		int sid=Integer.parseInt(id);
		
		String gender=req.getParameter("gender");
		String phono= req.getParameter("phno");
		
		long num = Long.parseLong(phono);		
		
		
		studentDto dto=new studentDto();
		dto.setStd_id(sid);
		dto.setStd_name(id1);
		dto.setGender(gender);
		dto.setPhnno(num);
		
		
		Studentdao studentdao=new Studentdao();
	String msg=	studentdao.create(dto);
		res.getWriter().print(msg);
		
		
	}
}
