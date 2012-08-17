package scjp.genericlibrary;

public class CompactDisc implements Lendable<Integer> {
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
		return String.format("CompactDisc[%s,%s]", libraryCode, name);
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

}
