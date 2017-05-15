package cn.itcast_03;

import java.util.Scanner;

//校验手机号是否符合我的规格
public class ReGexDemo {
	public static void main(String[] args) {
		//键盘录入手机号
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个电话号码");
		String phone = sc.nextLine();
		
		//定义正则表达式
		String regex = "1[38]\\d{9}";
		
		boolean flag = phone.matches(regex);
		System.out.println("flaf : " + flag);
	}
}
