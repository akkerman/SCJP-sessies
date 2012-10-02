
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

public class Opdr2 {

	
	public static void main(String[] args) {
		
        //create new java.util.Date object
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:ss");

        String strDate = dateFormat.format(date);
        System.out.print(strDate);
        
		strDate = strDate.substring(0, 10);
		System.out.print(strDate.toString().length);
		if("2012-09-27".equalsIgnoreCase(strDate)){
			System.out.print("today!!");
		}
	}
}
