package cn.Date;

import java.util.Date;




//Date ;表示特定的瞬间，精确到毫秒；

/*
 *  构造方法：
 *  	Data（）；根据当前时间，创建日期对象；
 *  	Data（long data） ；根据给定的毫秒值，创建日期对象；
 *  
 * 
 */
public class DateDemo {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
	}
}
