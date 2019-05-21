package by.htp.webapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.webapp.controller.command.Command;
import by.htp.webapp.controller.command.CommandManager;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	
	private static final String REQ_ACTION = "action";
	private static final long serialVersionUID = 1L;
       
  
    public FirstServlet() {
    	
    	System.out.println("FirstServlet()");
        
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter(REQ_ACTION);
		Command command = CommandManager.defineCommand(action);
		String value = command.performAction(request);
		
		if(value.contains("page:")) {
			String page = value.substring(5);
			System.out.println(page);
		} else if(value.contains("action:")) {
			action=value.substring(6);
			command = CommandManager.defineCommand(action);
		}
		request.getRequestDispatcher(value).forward(request,response);
		
		doGet(request, response);
	}

}
