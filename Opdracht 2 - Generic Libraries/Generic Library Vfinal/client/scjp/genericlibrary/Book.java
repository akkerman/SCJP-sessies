package scjp.genericlibrary;

class Book implements Lendable<String> {
	private String libraryCode;
	private String title;
	private String author;

	public Book(String libraryCode) {
		if (libraryCode == null)
			throw new NullPointerException("Library code is mandatory");
		this.libraryCode = libraryCode;
	}

	@Override
	public String getLibraryCode() {
		return libraryCode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return String.format("Book[%s,%s]", libraryCode, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj instanceof Book) {
			Book that = (Book) obj;
			return this.libraryCode.equals(that.libraryCode);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return 13 * libraryCode.hashCode();
	}
	
	public static class Builder {
		private Book book;

		public Builder(String code) {
			this.book = new Book(code);
		}
		
		public Builder author(String author) {
			book.setAuthor(author);
			return this;
		}
		public Builder title(String title) {
			book.setTitle(title);
			return this;
		}
		public Book create() {
			return book;
		}			
	}

}
