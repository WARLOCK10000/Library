package by.htp.library.dao.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import by.htp.library.dao.BookDao;
import by.htp.library.entity.Book;

public class MySQLBookDaoImpl implements BookDao {

	private static final String URL = "jdbc:mysql://localhost:3306/library";
	private static final String USER = "root";
	private static final String PASS = "root";
	private static final String SQL_SELECT_BOOKS = "select book.id, book.title from book";
	private static final String SQL_SELECT_BOOK_BY_ID = "select book.id, book.title from book where book.id = ?";

	public List<Book> listBooks() {
		List<Book> books = new ArrayList<>();
		loadDriver();
		try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
			 Statement st = conn.createStatement()) {
			ResultSet rs = st.executeQuery(SQL_SELECT_BOOKS);

			while (rs.next()) {
				Book book = new Book();
				int id = rs.getInt("id");
				String title = rs.getString("title");

				book.setId(id);
				book.setTitle(title);

				books.add(book);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return books;
	}

	@Override
	public Book readBook(int id) {
		Book book = new Book();
		loadDriver();
		try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
			 PreparedStatement ps = conn.prepareStatement(SQL_SELECT_BOOK_BY_ID)) {
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery(SQL_SELECT_BOOKS);

			if (rs.next()) {
				int bookId = rs.getInt("id");
				String bookTitle = rs.getString("title");

				book.setId(bookId);
				book.setTitle(bookTitle);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return book;
	}

	private void loadDriver() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			System.out.println("where driver . . . .");
			e1.printStackTrace();
		}
	}
}
