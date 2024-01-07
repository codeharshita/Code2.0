package com.studyeasy.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/formJspServlet")
public class FormJspServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public FormJspServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println(request.getParameter("name"));
		response.getWriter().println(request.getParameter("gender"));
		
		response.getWriter().println(request.getParameter("Country"));
		
		PrintWriter out = response.getWriter();
		
		String[] languages = request.getParameterValues("language");
		if(languages != null){
			for(int i =0; i<languages.length ; i++){
				
				out.print(languages[i]);
				out.print("<br/>");
			}
		}else{
			out.print("None Selected.");
		}

		
	}

}
