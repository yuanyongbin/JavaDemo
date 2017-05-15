package cn.itcast_03;

import java.util.Scanner;

//邮箱的校验
public class ReGexDemo_01 {
		public static void main(String[] args) {
			//键盘录入
			Scanner sc = new Scanner(System.in);
			System.out.println("输入一个邮箱号码");
			String mail = sc.nextLine();
			
			//正则表达式
			String regex = "\\w+@\\w{2,6}(\\.\\w{2,3})+";
			
			boolean flag = mail.matches(regex);
			
			System.out.println("ReGex : " + flag);
	}
}
