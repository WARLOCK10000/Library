package by.htp.library.command.impl;

import by.htp.library.command.Command;
import by.htp.library.entity.Book;
import by.htp.library.service.LibraryService;
import by.htp.library.service.impl.OnlineLibraryServiceImpl;

import javax.servlet.http.HttpServletRequest;

public class ViewBook implements Command {

    private LibraryService service;

    @Override
    public String performAction(HttpServletRequest request) {

        service = new OnlineLibraryServiceImpl();

        String id = request.getParameter("book_id");

        int book_id = Integer.parseInt(id);


        Book book = service.getSingleCatalogBook(1);
        request.setAttribute("Book", book);

        return "/pages/single_book.jsp";
    }

}
