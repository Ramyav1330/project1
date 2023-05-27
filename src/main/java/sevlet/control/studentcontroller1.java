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

@WebServlet("/update1")
public class studentcontroller1 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		String sid=req.getParameter("sid");
		int cid=Integer.parseInt(sid);
		String sname=req.getParameter("sname");
		String number=req.getParameter("number");
		long cnumber=Long.parseLong(number);
		String gender=req.getParameter("gender");
		
		studentDto yu=new studentDto();
		yu.setStd_id(cid);
		yu.setStd_name(sname);
		yu.setPhnno(cnumber);
		yu.setGender(gender);
		
		Studentdao dao= new Studentdao();
		String msg=dao.update1(yu);
		
		
		  List<studentDto> list= dao.fetchall();
		  
		  req.setAttribute("studentlist", list);
		  
		  resp.getWriter().print(msg);
		  
		  RequestDispatcher rd=req.getRequestDispatcher("download.jsp");
		  rd.forward(req, resp);
		
	}
	

}
