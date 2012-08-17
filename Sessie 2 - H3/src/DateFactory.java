import java.util.Date;

public class DateFactory {
	
	enum months {JANUARY, FEBRUARY, MARCH, APRIL, MAY}
	Boolean isItChristmas = false;

	public static void main(int[] args) {
		
		int currentday = args[9];

		Date now;
		if (now == null) { 
			System.out.println("ok I'll do it for you");
			now = new Date();
		}
		
		int[] monthlist = {1,2,3,4,5};
		System.out.println(monthlist[months.MAY]);		
		
		specialYear(now.getYear());
	}

	private static void specialYear(Integer year) {
		isItChristmas = year.equals(2013) || year == new Integer(2014);
	}
}	