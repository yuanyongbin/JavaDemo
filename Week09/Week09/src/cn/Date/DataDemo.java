package cn.Date;

import java.util.Date;




//Date�� ����ʾ�ض���ʱ�䣬��ȷ������


public class DataDemo {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		long time = System.currentTimeMillis();
		Date d1 = new Date(time);
		System.out.println(d1);
		
	}
}
