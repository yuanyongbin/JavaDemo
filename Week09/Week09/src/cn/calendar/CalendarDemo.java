package cn.calendar;

import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		//��ȡ�꣺
		int year = cal.get(Calendar.YEAR); 
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(year + "��" + month + "��" + day + "��");
	}
}
