package by.htp.library.command;

import javax.servlet.http.HttpServletRequest;

public interface Command {
	
	String performAction(HttpServletRequest request);
	

}
