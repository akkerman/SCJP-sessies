package scjp.genericlibrary;

import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("rawtypes")
public class LibraryTest {

	private static final String CODE_IN = "in";
	private static final String CODE_OUT = "out";

	private Library<String> library;
	private final Lendable<String> lendableIn = new TestLendable(CODE_IN);
	private final Lendable<String> lendableIn2 = new TestLendable(CODE_IN);

	// private final Lendable lendableOut = new TestLendable(CODE_OUT);

	@Before
	public void createLibrary() {
		library = new Library<String>();
		library.returnItem(lendableIn);
	}


	@Test
	public void testReturnItem_Twice() {
		library.returnItem(lendableIn);
		Collection available = library.availableItems();
		assertEquals("double item", 1, available.size());
	}

	@Test
	public void testReturnItem_Overwrite() {
		library.returnItem(lendableIn2);
		Collection available = library.availableItems();
		assertEquals("double item", 1, available.size());
	}
	
	@Test
	public void testLendItem_Available() {
		Lendable lendedItem = library.lendItem(CODE_IN);
		assertSame("Could not lend item", lendableIn, lendedItem);
	}

	@Test
	public void testLendItem_NotAvailable() {
		Lendable lendedItem = library.lendItem(CODE_OUT);
		assertNull("No item expected", lendedItem);
	}

	@Test
	public void testAvailableItems_BeforeLend() {
		library.lendItem(CODE_IN);
		Collection available = library.availableItems();
		assertTrue("There are still items available", available.isEmpty());
	}

	@Test
	public void testDueItems_BeforeLend() {
		Collection due = library.dueItems();
		assertTrue("There are already items due", due.isEmpty());
		library.lendItem(CODE_IN);
	}

	@Test
	public void testDueItems_AfterLend() {
		library.lendItem(CODE_IN);
		Collection due = library.dueItems();
		assertFalse("There are no items due", due.isEmpty());
		
	}
	
	@Test
	public void testDueItems_AfterLend_NotAvailable() {
		library.lendItem(CODE_OUT);
		Collection due = library.dueItems();
		assertTrue("There are items due, thow nothing should be lended", due.isEmpty());			
	}
}
