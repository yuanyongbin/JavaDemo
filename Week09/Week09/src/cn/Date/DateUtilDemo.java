package cn.Date;

import java.text.ParseException;
import java.util.Date;

//DateUtil ������Ĳ��ԣ�

public class DateUtilDemo {
	public static void main(String[] args) throws ParseException {
		//�������ڶ��� 
		
		// Date -- Sting  ת��
		Date d = new Date();
		String s = "yyyy��MM��dd�� HH:mm:ss";
		String ss = DateUtil.dataToString(d, s);
		System.out.println(ss);
		
		// String -- Date ��ת��
		
		String s1 = "2008��08��08�� 08:08:08";
		String ss1 = "yyyy��MM��dd�� HH:mm:ss";
		Date time = DateUtil.StringToDate(s1, ss1);
		System.out.println(time);
		
	}
}
