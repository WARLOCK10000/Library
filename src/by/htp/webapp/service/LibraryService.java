package by.htp.webapp.service;

import by.htp.webapp.entity.Book;
import by.htp.webapp.service.dto.Catalog;

public interface LibraryService {

	Catalog getItemsCatalog();

	Book getSingleCatalogBook(int id);
}
