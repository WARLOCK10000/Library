package by.htp.webapp.controller.command;

import javax.servlet.http.HttpServletRequest;

public interface Command {
	
	String performAction(HttpServletRequest request);
	

}
