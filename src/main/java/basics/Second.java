package basics;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Second extends GenericServlet{
		@Override
		public  void service(ServletRequest arg1, ServletResponse arg) throws ServletException,IOException
		{
		System.out.println("Welcome to generic servlets second");
		arg.getWriter().print("welcome to generic servlets second");
	}
	}

