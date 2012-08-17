package scjp.genericlibrary;

import java.util.Collection;

import org.junit.Test;

public class DueItemsTester {

	@Test
	public void dueItems() {
		Library<String,Book> bookLibrary = new Library<String, Book>();
		
		bookLibrary.returnItem(
				new Book.Builder("978-0071591065")
					.title("SCJP Sun Certified Programmer for Java 6 Study Guide (CX-310-065): Exam 310-065")
					.author("Sierra, Bates")
					.create()
				);
				

		bookLibrary.returnItem(
				new Book.Builder("978-0596527754")
					.title("Java Generics and Collections")
					.author("Naftalin, Wadler")
					.create()
				);
		
		Library<Integer,CompactDisc> cdLibrary = new Library<Integer, CompactDisc>();
		
		cdLibrary.returnItem(new CompactDisc(1));
		cdLibrary.returnItem(new CompactDisc(2));
		cdLibrary.returnItem(new CompactDisc(3));
		
		
		bookLibrary.lendItem("978-0596527754");
		cdLibrary.lendItem(1);
		cdLibrary.lendItem(3);
		
		Collection<Lendable<?>> itemsDue = Library.allDueItems(bookLibrary, cdLibrary);
		
		for (Lendable<?> item : itemsDue) {
			System.out.println(item);
		}
		
		
	}

}
