package org.studyeasy.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Controller() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name =request.getParameter("page");
		if(name.equals("login")) {
			request.getRequestDispatcher("/Login.jsp").forward(request, response);
		}else if (name.equals("signup")) {
			request.getRequestDispatcher("/SignUp.jsp").forward(request, response);
			
		}else if (name.equals("about")) {
			request.getRequestDispatcher("/About.jsp").forward(request, response);
		}
	}
}
