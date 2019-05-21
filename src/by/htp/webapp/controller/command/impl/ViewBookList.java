package by.htp.webapp.controller.command.impl;

import by.htp.webapp.service.impl.OnlineLibraryServiceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;



import by.htp.webapp.controller.command.Command;
import by.htp.webapp.service.LibraryService;
import by.htp.webapp.service.dto.Catalog;

public class ViewBookList implements Command {
	
	private LibraryService service;

	@Override
	public String performAction(HttpServletRequest request) {
		
		service = new OnlineLibraryServiceImpl();
		Catalog catalog = service.getItemsCatalog();
		
		
		request.setAttribute("books", catalog.getBooks() );
		
		return "/pages/booklist.jsp";
	}
	
	

}
