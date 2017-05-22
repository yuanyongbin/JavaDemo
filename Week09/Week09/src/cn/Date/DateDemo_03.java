package cn.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



/*
 *  Date  --  String（格式化）
 *  	public final String format(Date date):将一个 Date 格式化为日期/时间字符串。 
 *  String --  Date（解析）
 *  	public Date parse(String source)
           throws ParseException :从给定字符串的开始解析文本，以生成一个日期
 *  FormatDateFormat 
 *  	是日期/时间格式化子类的抽象类，它以与语言无关的方式格式化并解析日期或时间。
 *  	日期/时间格式化子类（如 SimpleDateFormat）允许进行格式化（也就是日期 -> 文本）、
 *  	解析（文本-> 日期）和标准化。（由于该类是抽象类，所以必须使用具体的子类：SimpleDateFormat）
 *  	SimpleDateFormat 的构造方法
 *  		SimpleDateFormat() ：默认模式
 *			SimpleDateFormat(String pattern)：给定模式 
 *
 *  
 */
public class DateDemo_03 {
	public static void main(String[] args) throws ParseException {
		//Date -- String 
		//创建日期
		
		Date d = new Date();
		//创建格式化对象：(默认模式）
		SimpleDateFormat sdf = new SimpleDateFormat();
		String s = sdf.format(d);
		System.out.println(s);
		
		System.out.println("--------------------------------");
		//创建格式化对象：（给定模式）
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		String s1 = sdf1.format(d);
		System.out.println(s1);
		System.out.println("--------------------------------");
		//String -- Date
		
		String time = "2008-08-08 08:08:08";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dd = sdf2.parse(time);
		System.out.println(dd);
		
	}
}
