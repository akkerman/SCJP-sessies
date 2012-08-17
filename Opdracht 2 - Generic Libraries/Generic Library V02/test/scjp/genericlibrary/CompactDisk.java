package scjp.genericlibrary;

public class CompactDisk implements Lendable<Integer> {
    private Integer code;
    private String name;
    private String artist;
    
    public CompactDisk(Integer libraryCode) {
    	this.code = libraryCode;
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
		return this.code;
	}
	
	@Override
	public String toString() {
		return String.format("CompactDisk[%s,%s]",code,name);
	}

}
