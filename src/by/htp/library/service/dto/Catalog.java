package by.htp.library.service.dto;

import java.util.List;

import by.htp.library.entity.Author;
import by.htp.library.entity.Book;

public class Catalog {

	private List<Book> books;
	private List<Author> authors;

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	@Override
	public String toString() {
		return "Catalog [books=" + books + ", authors=" + authors + "]";
	}

}
