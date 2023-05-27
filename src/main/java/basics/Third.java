package basics;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
 
@WebServlet("/annotation")
public class Third extends GenericServlet{
	
		public  void service(ServletRequest arg1, ServletResponse res) throws ServletException,IOException
		{
	res.getWriter().print("Welcome to anotation servlets");
	
	}
	}
