package by.htp.library.storage;

import by.htp.library.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class BookMemoryStorage {

    private List<Book> books;

    {

        books = new ArrayList<>();
        books.add(new Book());
        books.add(new Book());
        books.add(new Book());
        books.add(new Book());
        books.add(new Book());
        books.add(new Book());

    }

    public List<Book> getBooks() {
        return books;
    }

}
