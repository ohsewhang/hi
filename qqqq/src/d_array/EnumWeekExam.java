package d_array;

import java.util.Calendar;

public class EnumWeekExam {
	public EnumWeekExam() {
	
		Week today = null;
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(week);
		
		switch(week) {
		case 1 : today = Week.SUNDAY;break;
		case 2 : today = Week.MONDAY;break;
		case 3 : today = Week.TUESDAY;break;
		case 4 : today = Week.WEDNESDAY;break;
		case 5 : today = Week.THURSDAY;break;
		case 6 : today = Week.FRIDAY;break;
		case 7 : today = Week.SATURDAY;break;
		
		}
	 System.out.println("오늘 요일 : " +today);
	 if(today == Week.SUNDAY) {
		 System.out.println("일요일은 축구");
	 } else { System.out.println("자바 공부");
	 
	 }
  }
	public static void main(String[] args) {
		new EnumWeekExam();
	}
}