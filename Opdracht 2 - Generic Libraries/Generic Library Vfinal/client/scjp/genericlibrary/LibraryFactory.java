package scjp.genericlibrary;

public final class LibraryFactory {
	private LibraryFactory() {

	}

	public static Library<String, Book> studyBooksLibrary() {
		Library<String, Book> lib = new Library<String, Book>();
		lib.returnItem(
			Book.build("978-0071591065")
				.title("SCJP Sun Certified Programmer for Java 6 Study Guide (CX-310-065): Exam 310-065")
				.author("Sierra, Bates")
				.create()
		);
		lib.returnItem(
			Book.build("978-0596527754")
				.title("Java Generics and Collections")
				.author("Naftalin, Wadler")
				.create()
		);
		lib.returnItem(
			Book.build("978-0596100940")
				.title("Beyond Java")
				.author("Bruce A. Tate")
				.create()
		);
		lib.returnItem(
			Book.build("978-0596006761")
				.title("Better, Faster, Lighter Java")
				.author("Bruce A. Tate")
				.create()
		);
		lib.returnItem(
			Book.build("978-1430218333")
				.title("Pro Git (Expert's Voice in Software Development)")
				.author("Scott Chacon")
				.create()
		);
		lib.returnItem(
			Book.build("978-0132350884")
				.title("Clean Code: A Handbook of Agile Software Craftsmanship")
				.author("Robert C. Martin")
				.create()
		);
		return lib;
	}

	public static Library<Integer,CompactDisc> cdLibrary() {
		Library<Integer, CompactDisc> lib = new SortedLibrary<Integer,CompactDisc>();
		
		// top 10 uit album top 100 d.d. 17-8-2012
		lib.returnItem(CompactDisc.build(1).artist("HELENE FISCHER").name("FUR EINEN TAG").create());
		lib.returnItem(CompactDisc.build(2).artist("ANTONY AND THE JOHNSONS").name("CUT THE WORLD").create());
		lib.returnItem(CompactDisc.build(3).artist("BEN HOWARD").name("EVERY KINGDOM").create());
		lib.returnItem(CompactDisc.build(4).artist("GOLDEN EARRING").name("TITS 'N ASS").create());
		lib.returnItem(CompactDisc.build(5).artist("RACOON").name("LIVERPOOL RAIN").create());
		lib.returnItem(CompactDisc.build(6).artist("ADELE").name("21").create());
		lib.returnItem(CompactDisc.build(7).artist("MICHAEL KIWANUKA").name("HOME AGAIN").create());
		lib.returnItem(CompactDisc.build(8).artist("GERS PARDOEL").name("DEZE WERELD IS VAN JOU").create());
		lib.returnItem(CompactDisc.build(9).artist("JOHN MAYER").name("BORN AND RAISED").create());
		lib.returnItem(CompactDisc.build(10).artist("AMY WINEHOUSE").name("BACK TO BLACK").create());
		
		
		// for fun, and to see the effect of sorting :-)
		lib.returnItem(CompactDisc.build(17).artist("adele").name("LIVE AT THE ROYAL ALBERT HALL").create());
		lib.returnItem(CompactDisc.build(51).artist("amy winehouse").name("LIONESS: HIDDEN TREASURES").create());
		

		return lib;
	}
	
	public static void main(String[] args) {
		Library<String, Book> lib = studyBooksLibrary();
	}
}
