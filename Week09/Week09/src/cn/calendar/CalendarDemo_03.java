package cn.calendar;

import java.util.Calendar;
import java.util.Scanner;

//��ȡ������ݵĶ����ж�����
public class CalendarDemo_03 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		//����¼��һ����ݣ�
		Scanner sc = new Scanner(System.in);
		System.out.println("����һ����ݣ�");
		int year = sc.nextInt();
		cal.set(year, 2, 1);
		cal.add(Calendar.DATE, -1);
		System.out.println(year + "��Ķ�����" 
				+ cal.get(Calendar.DATE) + "��");
	}
}
