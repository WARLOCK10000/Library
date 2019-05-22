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
		return null;
	}

	public Book getSingleCatalogBook(int id) {
		bookDao = new MySQLBookDaoImpl();
		Book book = bookDao.readBook(id);
		return book;
	}
}
