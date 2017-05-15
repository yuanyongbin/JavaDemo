package cn.itcast_02;

import java.util.Scanner;

public class ReGexDemo {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个电话号码");
		String qq = sc.nextLine();
		
		System.out.println("checkQQ : " + checkQQ(qq));
	}
	
	public static boolean checkQQ(String qq){
		String regex =  "[1-9] [0-9]{4,14}";
		//public boolean matches(String regex)告知此字符串是否匹配给定的正则表达式。
		boolean flag = qq.matches(regex);
		return flag;
	}
}
