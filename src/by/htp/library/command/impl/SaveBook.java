package by.htp.library.command.impl;

import by.htp.library.command.Command;

import javax.servlet.http.HttpServletRequest;

public class SaveBook implements Command {

    @Override
    public String performAction(HttpServletRequest request) {

        String title = request.getParameter("book_title");

        return title;
    }

}
