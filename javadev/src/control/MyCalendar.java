package control;

import java.util.Calendar;
import java.util.Scanner;

public class MyCalendar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Calendar c = Calendar.getInstance(); // 그레고리?
		
		System.out.print("년도: "); int year = sc.nextInt();
		System.out.print("월: "); int month = sc.nextInt();
		
		c.set(year, month-1, 1); //set()을 이용해 현재일을 지정할 수 있음
		
		
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK); // 1일이 무슨 요일인가?
		System.out.println(dayOfWeek);
		
		int endday = c.getActualMaximum(Calendar.DATE); // 마지막 날짜는 몇일인가?
		System.out.println(endday);
		
		System.out.println(year + "년" + month + "월");
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("____________________");
		
		for(int d = 1; d < dayOfWeek; d++) {
			System.out.print("   ");
		}
		
		for(int date = 1; date <= endday; date++, dayOfWeek++) {
			System.out.print(date < 10 ? " " + date + " ": date + " ");
			if (dayOfWeek % 7 == 0) System.out.println();
		}
	}
}
