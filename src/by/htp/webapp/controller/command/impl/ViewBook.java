package by.htp.webapp.controller.command.impl;

import javax.servlet.http.HttpServletRequest;

import by.htp.webapp.controller.command.Command;
import by.htp.webapp.entity.Book;
import by.htp.webapp.service.LibraryService;
import by.htp.webapp.service.impl.OnlineLibraryServiceImpl;

public class ViewBook implements Command {

	private LibraryService service;
		
		@Override
		public String performAction(HttpServletRequest request) {
			
			service = new OnlineLibraryServiceImpl();
			
			String id = request.getParameter("book_id");
			
			int book_id = Integer.parseInt(id);
			
			
			Book book = service.getSingleCatalogBook(1);
			request.setAttribute("Book", book);
		
		return null;
	}

}
