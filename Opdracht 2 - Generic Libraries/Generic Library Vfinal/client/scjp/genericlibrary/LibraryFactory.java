package scjp.genericlibrary;

public final class LibraryFactory {
	private LibraryFactory() {

	}

	public static Library<String, Book> studyBooksLibrary() {
		Library<String, Book> lib = new Library<String, Book>();
		lib.returnItem(
			new Book.Builder("978-0071591065")
				.title("SCJP Sun Certified Programmer for Java 6 Study Guide (CX-310-065): Exam 310-065")
				.author("Sierra, Bates")
				.create()
		);
		lib.returnItem(
			new Book.Builder("978-0596527754")
				.title("Java Generics and Collections")
				.author("Naftalin, Wadler")
				.create()
		);
		lib.returnItem(
			new Book.Builder("978-0596100940")
				.title("Beyond Java")
				.author("Bruce A. Tate")
				.create()
		);
		lib.returnItem(
			new Book.Builder("978-0596006761")
				.title("Better, Faster, Lighter Java")
				.author("Bruce A. Tate")
				.create()
		);
		lib.returnItem(
			new Book.Builder("978-1430218333")
				.title("Pro Git (Expert's Voice in Software Development)")
				.author("Scott Chacon")
				.create()
		);
		lib.returnItem(
			new Book.Builder("978-0132350884")
				.title("Clean Code: A Handbook of Agile Software Craftsmanship")
				.author("Robert C. Martin")
				.create()
		);
		return lib;
	}

	public static Library<Integer,CompactDisc> cdLibrary() {
		Library<Integer, CompactDisc> lib = new SortedLibrary<Integer,CompactDisc>();
		
		// top 10 uit album top 100 d.d. 17-8-2012
		lib.returnItem(new CompactDisc.Builder(1).artist("HELENE FISCHER").title("FUR EINEN TAG").create());
		lib.returnItem(new CompactDisc.Builder(2).artist("ANTONY AND THE JOHNSONS").title("CUT THE WORLD").create());
		lib.returnItem(new CompactDisc.Builder(3).artist("BEN HOWARD").title("EVERY KINGDOM").create());
		lib.returnItem(new CompactDisc.Builder(4).artist("GOLDEN EARRING").title("TITS 'N ASS").create());
		lib.returnItem(new CompactDisc.Builder(5).artist("RACOON").title("LIVERPOOL RAIN").create());
		lib.returnItem(new CompactDisc.Builder(6).artist("ADELE").title("21").create());
		lib.returnItem(new CompactDisc.Builder(7).artist("MICHAEL KIWANUKA").title("HOME AGAIN").create());
		lib.returnItem(new CompactDisc.Builder(8).artist("GERS PARDOEL").title("DEZE WERELD IS VAN JOU").create());
		lib.returnItem(new CompactDisc.Builder(9).artist("JOHN MAYER").title("BORN AND RAISED").create());
		lib.returnItem(new CompactDisc.Builder(10).artist("AMY WINEHOUSE").title("BACK TO BLACK").create());
		
		
		// for fun, and to see the effect of sorting :-)
		lib.returnItem(new CompactDisc.Builder(17).artist("adele").title("LIVE AT THE ROYAL ALBERT HALL").create());
		lib.returnItem(new CompactDisc.Builder(51).artist("amy winehouse").title("LIONESS: HIDDEN TREASURES").create());
		

		return lib;
	}
}
