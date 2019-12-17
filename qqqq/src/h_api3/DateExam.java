package h_api3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExam {

	
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd(E) hh :mm :ss");
		System.out.println(sdf.format(now));
		
		Calendar cal = Calendar.getInstance();
		System.err.println(cal.get(Calendar.MONTH));
	}
}
