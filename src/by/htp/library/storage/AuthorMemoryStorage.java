package by.htp.library.storage;

import by.htp.library.entity.Author;

import java.util.ArrayList;
import java.util.List;

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
