//	date and time in java.
import java.util.*;
public class TimeDemo2 {

	public static void main(String[] args) {
		
		GregorianCalendar g = new GregorianCalendar();
		System.out.println(g.isLeapYear(2020));
		System.out.println(g.isLeapYear(2023));
		System.out.println(g.get(Calendar.DATE));
		System.out.println(g.get(Calendar.DAY_OF_YEAR));
		
	}

}
