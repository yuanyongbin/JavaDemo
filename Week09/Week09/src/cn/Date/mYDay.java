package cn.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//��һ��������������������
public class mYDay {
	public static void main(String[] args) throws ParseException {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ĳ��������գ���ʽΪ��xxxx��xx��xx�� ����2008��08��08��");
		String brithday = sc.nextLine();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��");
		Date d = sdf.parse(brithday);
		long myday = d.getTime();
		long now = System.currentTimeMillis();
		long length = now - myday;
		int day = (int) (length/1000/60/60/24);
		System.out.println("������������磺" + day + "����");
		
	}
}
