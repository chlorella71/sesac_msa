package control;

import java.util.Calendar;

public class CalendarTest1 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance(); // 그레고리?
		c.set(2024, 10-1, 1); //set()을 이용해 현재일을 지정할 수 있음
		
		int year = c.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = c.get(Calendar.MONTH) +1;
		System.out.println(month); // 1월은 0으로 저장되기때문에 현재 월 -1 값이 출력, 그레고리?
		
		int day = c.get(Calendar.DATE);
		System.out.println(day);
		
		int hour = c.get(Calendar.HOUR_OF_DAY);
		System.out.println(hour);
		
		int minute = c.get(Calendar.MINUTE);
		System.out.println(minute);
		
		int second = c.get(Calendar.SECOND);
		System.out.println(second);
		
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK); //현재일의 요일 (일요일: 1, 토요일: 7)
		System.out.println(dayOfWeek);
		
		int endday = c.getActualMaximum(Calendar.DATE); // 그 달의 마지막날짜
		System.out.println(endday);
	}
}
