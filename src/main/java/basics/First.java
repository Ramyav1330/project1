package basics;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class First extends GenericServlet{
	@Override
	public  void service(ServletRequest req, ServletResponse res) throws IOException
	{
	System.out.println("Welcome to generic servlets");
	res.getWriter().print("welcome to generic servlets");
}
}