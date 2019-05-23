package by.htp.library.dao;

import by.htp.library.entity.Book;

import java.util.List;

public interface BookDao {

    List<Book> listBooks();

    Book readBook(int id);

}
