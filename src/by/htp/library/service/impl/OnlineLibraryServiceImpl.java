package by.htp.library.service.impl;

import java.util.List;

import by.htp.library.dao.BookDao;
import by.htp.library.dao.database.MySQLBookDaoImpl;
import by.htp.library.service.LibraryService;
import by.htp.library.service.dto.Catalog;
import by.htp.library.entity.Book;

public class OnlineLibraryServiceImpl implements LibraryService {

	private BookDao bookDao;

	@Override
	public Catalog getItemsCatalog() {
		bookDao = new MySQLBookDaoImpl();
		List<Book> books = bookDao.listBooks();
		Catalog catalog = new Catalog();
		catalog.setBooks(books);
		return catalog;
	}

	public Book getSingleCatalogBook(int id) {
		bookDao = new MySQLBookDaoImpl();
		return bookDao.readBook(id);
	}
}
