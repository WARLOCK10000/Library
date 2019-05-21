package by.htp.webapp.controller.command.impl;

import javax.servlet.http.HttpServletRequest;

import by.htp.webapp.controller.command.Command;

public class SaveBook implements Command {

	@Override
	public String performAction(HttpServletRequest request) {

		String title = request.getParameter("book_title");

		return title;
	}

}
