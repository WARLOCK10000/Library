package by.htp.webapp.service.impl;

import java.util.List;

import by.htp.webapp.dao.BookDao;
import by.htp.webapp.dao.database.MySQLBookDaoImpl;
import by.htp.webapp.service.LibraryService;
import by.htp.webapp.service.dto.Catalog;
import by.htp.webapp.entity.Book;

public class OnlineLibraryServiceImpl implements LibraryService {

	private BookDao bookDao;

	@Override
	public Catalog getItemsCatalog() {

		bookDao = new MySQLBookDaoImpl();
		List<Book> books = bookDao.listBooks();
		Catalog catalog = new Catalog();
		catalog.setBooks(books);
		return null;
	}

	public Book getSingleCatalogBook(int id) {
		bookDao = new MySQLBookDaoImpl();
		Book book = bookDao.readBook(id);
		return book;
	}
}
