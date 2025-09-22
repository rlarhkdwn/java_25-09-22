package day13;

import java.util.Calendar;
import java.util.Date;

public class Date01 {

	public static void main(String[] args) {
		// 날짜 시간 클래스
		// Date 클래스 => Deprecated(비권장)
		// Calendar / LocalDateTime
		
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getDate());
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR));
		int year = c.get(Calendar.YEAR);
		// 월 0~11로 표현
		System.out.println(c.get(Calendar.MONTH) + 1);
		int month = c.get(Calendar.MONTH) + 1;
		
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
		// 일(1)~토(7)
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		
		// 2025-9-11 (목)
		String[] dayOfWeekList = {"", "일", "월", "화", "수", "목", "금", "토"};
		System.out.printf("%d-%d-%d (%s)\n", year, month, dayOfMonth, dayOfWeekList[dayOfWeek]);
		
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		System.out.printf("%d:%d:%d", hour, minute, second);
		
		// am / pm => 0(am), 1(pm)
		int amPm = c.get(Calendar.AM_PM);
		System.out.println(c.get(Calendar.AM_PM));
		
		// 오후 2:48:13
		String[] amPmList = {"오전", "오후"};
		System.out.printf("%s %d:%d:%d\n", amPmList[amPm], hour, minute, second);
		
	}

}
