package cn.Date;

import java.text.ParseException;
import java.util.Date;

//DateUtil 工具类的测试：

public class DateUtilDemo {
	public static void main(String[] args) throws ParseException {
		//创建日期对象： 
		
		// Date -- Sting  转换
		Date d = new Date();
		String s = "yyyy年MM月dd日 HH:mm:ss";
		String ss = DateUtil.dataToString(d, s);
		System.out.println(ss);
		
		// String -- Date 的转换
		
		String s1 = "2008年08月08日 08:08:08";
		String ss1 = "yyyy年MM月dd日 HH:mm:ss";
		Date time = DateUtil.StringToDate(s1, ss1);
		System.out.println(time);
		
	}
}
