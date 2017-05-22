package cn.calendar;

import java.util.Calendar;
import java.util.Scanner;

//获取任意年份的二月有多少天
public class CalendarDemo_03 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		//键盘录入一个年份：
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个年份：");
		int year = sc.nextInt();
		cal.set(year, 2, 1);
		cal.add(Calendar.DATE, -1);
		System.out.println(year + "年的二月有" 
				+ cal.get(Calendar.DATE) + "天");
	}
}
