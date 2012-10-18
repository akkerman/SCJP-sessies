package scjp.genericlibrary;

import nl.viewsource.util.FluentInterface;

public class CompactDisc implements Lendable<Integer>, Comparable<CompactDisc> {

	private Integer libraryCode;
	private String name;
	private String artist;

	public CompactDisc(Integer libraryCode) {
		if (libraryCode == null)
			throw new NullPointerException("Library code is mandatory");
		this.libraryCode = libraryCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public Integer getLibraryCode() {
		return this.libraryCode;
	}

	@Override
	public String toString() {
		return String.format("CompactDisc(%d){%s,%s}", libraryCode, artist, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj instanceof CompactDisc) {
			CompactDisc that = (CompactDisc) obj;
			return this.libraryCode.equals(that.libraryCode);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return 7 * libraryCode.hashCode();
	}
	
	@Override
	public int compareTo(CompactDisc that) {
		int result = compare(this.artist, that.artist);
		return result == 0 ? compare(this.name, that.name) : result;
	}
	
	private int compare(String a, String b) {		
		if (a == null && b == null) 
			return 0;
		if (a == null) 
			return -1;
		if (b == null)
			return 1;
		return a.compareToIgnoreCase(b);
	}
	
	public static CDBuilder build(Integer code) {
		return FluentInterface.create(new CompactDisc(code), CDBuilder.class);
	}
		
	public static interface CDBuilder {
		CDBuilder artist(String author);
		CDBuilder name(String name);
		CompactDisc create();
	}

}
