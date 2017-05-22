package cn.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//算一下你来到这个世界多少天
public class mYDay {
	public static void main(String[] args) throws ParseException {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的出生年月日：格式为：xxxx年xx月xx日 例：2008年08月08日");
		String brithday = sc.nextLine();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		Date d = sdf.parse(brithday);
		long myday = d.getTime();
		long now = System.currentTimeMillis();
		long length = now - myday;
		int day = (int) (length/1000/60/60/24);
		System.out.println("你来到这个世界：" + day + "天了");
		
	}
}
