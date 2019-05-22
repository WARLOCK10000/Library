package by.htp.library.storage;

import java.util.ArrayList;
import java.util.List;

import by.htp.library.entity.Author;

public class AuthorMemoryStorage {
	private List<Author> authors;

	{
//		
		authors = new ArrayList<>();
		authors.add(new Author());
		authors.add(new Author());
		authors.add(new Author());

	}

	public List<Author> getAuthors() {
		return authors;
	}

}
