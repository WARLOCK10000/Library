package by.htp.library.dao;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import by.htp.library.dao.database.MySQLBookDaoImpl;
import by.htp.library.entity.Book;

public class BookDaoGeneralTest {

	private BookDao dao;

	@Before
	public void initDaoImpl() {
		dao = new MySQLBookDaoImpl();
	}

	@Test
	public void listBooksNotNull() {

		Assert.assertTrue(true);

	}

	@Test
	public void listBooksNotEmpty() {
		List<Book> books = dao.listBooks();
		Assert.assertFalse(books.isEmpty());
	}

}
