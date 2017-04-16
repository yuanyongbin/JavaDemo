package cn.itcast_03;

import java.util.Scanner;

public class StringDemo02 {
	public static void main(String[] args) {
		// 定义用户名和密码。已存在的。
		String username = "admin";
		String password = "admin";

		for (int x = 0; x < 3; x++) {
			// x=0,1,2
			// 键盘录入用户名和密码。
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入用户名：");
			String name = sc.nextLine();
			System.out.println("请输入密码：");
			String pwd = sc.nextLine();

			// 比较用户名和密码。
			if (name.equals(username) && pwd.equals(password)) {
				// 如果都相同，则登录成功
				System.out.println("登录成功,开始玩游戏");
				//猜数字游戏
				GuessNumberGame.start();
				break;
			} else {
				if ((2 - x) == 0) {
					System.out.println("帐号被锁定，请与班长联系");
				} else {
					System.out.println("登录失败，你还有" + (2 - x) + "次机会");
				}
			}
		}
	}
}
