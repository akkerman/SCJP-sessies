
protected enum IssueSize{ MICHAEL, TJALKE, ROB, CHRIS }

public class Test implements TestRuns {

	public IssueSize size;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		test.size = new IssueSize.TJALKE;
		test.run();
	}

	@Override
	public void run() {
		TestGrade gr = TestGrade.BAD;
	}
}

interface TestRuns{
	enum TestGrade{GOOD, BAD, WORSE};
	void run();
}
