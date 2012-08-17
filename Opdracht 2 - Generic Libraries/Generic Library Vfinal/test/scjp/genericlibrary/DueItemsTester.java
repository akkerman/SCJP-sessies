package scjp.genericlibrary;

import java.util.Collection;

import org.junit.Test;


public class DueItemsTester {

	@Test
	public void dueItems() {
		Library<String,Book> bookLibrary = LibraryFactory.studyBooksLibrary();		
		Library<Integer,CompactDisc> cdLibrary = LibraryFactory.cdLibrary();
		
		
		bookLibrary.lendItem("978-0596527754");
		cdLibrary.lendItem(1);
		cdLibrary.lendItem(17);
		cdLibrary.lendItem(6);
		cdLibrary.lendItem(2);
		
		Collection<Lendable<?>> itemsDue = Library.allDueItems(bookLibrary, cdLibrary);
		
		for (Lendable<?> item : itemsDue) {
			System.out.println(item);
		}
		System.out.println("----");
		for (Book book : bookLibrary.availableItems()) {
			System.out.println(book);
		}
		
		
	}

}
