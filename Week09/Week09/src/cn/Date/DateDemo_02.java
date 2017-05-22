package cn.Date;

import java.util.Date;

/*
 * Data 方法：
 * 	public long getTime（）；获取时间以毫秒为单位
 * 	public void setTime（long time）；设置时间
 */
public class DateDemo_02 {
	public static void main(String[] args) {
		//创建对象
		Date d = new Date();
		//获取时间
		long time = d.getTime();
		System.out.println(d);
		System.out.println(time);
		//设置时间
		d.setTime(1000);
		System.out.println("d :" + d);
		time = d.getTime();
		System.out.println(time);

	}
}
