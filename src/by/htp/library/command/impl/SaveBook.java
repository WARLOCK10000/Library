package by.htp.library.command.impl;

import javax.servlet.http.HttpServletRequest;

import by.htp.library.command.Command;

public class SaveBook implements Command {

	@Override
	public String performAction(HttpServletRequest request) {

		String title = request.getParameter("book_title");

		return title;
	}

}
