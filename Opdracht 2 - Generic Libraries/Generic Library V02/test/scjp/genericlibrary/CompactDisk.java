package scjp.genericlibrary;

public class CompactDisk implements Lendable<Integer> {
    private Integer code;
    
    public CompactDisk(Integer libraryCode) {
    	this.code = libraryCode;
    }
	@Override
	public Integer getLibraryCode() {
		return this.code;
	}

}
