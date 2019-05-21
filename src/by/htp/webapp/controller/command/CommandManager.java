package by.htp.webapp.controller.command;

import by.htp.webapp.controller.command.impl.AddBookAction;
import by.htp.webapp.controller.command.impl.SaveBook;
import by.htp.webapp.controller.command.impl.ViewBook;
import by.htp.webapp.controller.command.impl.ViewBookList;

public class CommandManager {

	public static Command defineCommand(String action) {

		switch (action) {
		case "book_list":
			return new ViewBookList();
		case "add_book":
			return new AddBookAction();
		case "save_book":
			return new SaveBook();
		case "view_book":
			return new ViewBook();
			
		default:
			return null;

		}

	}
}
