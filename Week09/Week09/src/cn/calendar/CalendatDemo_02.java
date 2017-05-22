package cn.calendar;

import java.util.Calendar;

public class CalendatDemo_02 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println("今年是：" + cal.get(Calendar.YEAR));
		cal.add(Calendar.YEAR, 5);
		System.out.println("add :" + cal.get(Calendar.YEAR));
		System.out.println("--------------------");
		cal.set(Calendar.YEAR, 2015);
		System.out.println("set :" + cal.get(Calendar.YEAR));
		
		cal.set(2008, 8, 8);
		System.out.println(cal.get(Calendar.YEAR)+ "年" + 
				cal.get(Calendar.MONTH) + "月" +
				cal.get(Calendar.DAY_OF_MONTH));
	}
}
