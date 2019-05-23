package by.htp.library.service;

import by.htp.library.entity.Book;
import by.htp.library.service.dto.Catalog;

public interface LibraryService {

    Catalog getItemsCatalog();

    Book getSingleCatalogBook(int id);
}
