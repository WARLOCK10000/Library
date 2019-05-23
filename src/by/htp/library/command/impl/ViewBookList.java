package by.htp.library.command.impl;

import by.htp.library.command.Command;
import by.htp.library.service.LibraryService;
import by.htp.library.service.dto.Catalog;
import by.htp.library.service.impl.OnlineLibraryServiceImpl;

import javax.servlet.http.HttpServletRequest;

public class ViewBookList implements Command {

    private LibraryService service;

    @Override
    public String performAction(HttpServletRequest request) {

        service = new OnlineLibraryServiceImpl();
        Catalog catalog = service.getItemsCatalog();


        request.setAttribute("books", catalog.getBooks());

        return "/pages/booklist.jsp";
    }


}
