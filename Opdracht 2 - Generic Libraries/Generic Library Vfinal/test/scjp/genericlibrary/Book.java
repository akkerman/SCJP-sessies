package scjp.genericlibrary;

class Book implements Lendable<String> {
	private String code;
	private String title;
	private String author;

	public Book(String code) {
		this.code = code;
	}

	@Override
	public String getLibraryCode() {
		return code;
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
		return String.format("Book[%s,%s]", code,title);
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
