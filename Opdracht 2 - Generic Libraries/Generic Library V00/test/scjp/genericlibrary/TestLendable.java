package scjp.genericlibrary;

class TestLendable implements Lendable {
	private String code;

	public TestLendable(String code) {
		this.code = code;
	}

	@Override
	public String getLibraryCode() {
		return code;
	}

	@Override
	public String toString() {
		return String.format("TestLendable[%s]", code);
	}

}
