package maypack4;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTest {

	public static void main(String[] args) {
		Calendar cal1= new GregorianCalendar();
		System.out.println("cal1:----"+cal1.getTime());
		
		Calendar cal2 = new GregorianCalendar();
		System.out.println("Cal2 "+cal2.getTime());
		//Date d1 =new Date();
		cal2.add(Calendar.YEAR, 1);
		System.out.println("Cal2 "+cal2);
		
		if(cal1.before(cal2)) {
			System.out.println("Cal2 " +cal2.getTime());
		}
		
		

	}

}
