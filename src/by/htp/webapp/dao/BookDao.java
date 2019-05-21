package by.htp.webapp.dao;

import java.util.List;

import by.htp.webapp.entity.Book;

public interface BookDao {

	List<Book> listBooks();

	Book readBook(int id);

}
