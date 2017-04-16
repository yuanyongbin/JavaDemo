package cn.itcast02;
import java.util.Scanner;
public class ScannerDemo {
	public static void main(String[] args) {
		// 创建对象
		Scanner sc = new Scanner(System.in);

		// 获取数据
		if (sc.hasNextInt()) {
			int x = sc.nextInt();
			System.out.println("x:" + x);
		} else {
			System.out.println("你输入的数据有误");
		}
	}
}