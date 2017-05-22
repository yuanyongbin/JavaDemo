package cn.Date;

import java.util.Date;




//Date类 ：表示特定的时间，精确到毫秒


public class DataDemo {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		long time = System.currentTimeMillis();
		Date d1 = new Date(time);
		System.out.println(d1);
		
	}
}
