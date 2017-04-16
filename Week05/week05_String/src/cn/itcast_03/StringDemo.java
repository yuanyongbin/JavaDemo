package cn.itcast_03;

import java.util.Scanner;
public class StringDemo {
	public static void main(String[] args) {
		String s1 = "helloworld";
		String s2 = "helloworld";
		String s3 = "HelloWorld";

		// boolean equals(Object obj):比较字符串的内容是否相同,区分大小写
		System.out.println("equals:" + s1.equals(s2));
		System.out.println("equals:" + s1.equals(s3));
		System.out.println("-----------------------");

		// boolean equalsIgnoreCase(String str):比较字符串的内容是否相同,忽略大小写
		System.out.println("equals:" + s1.equalsIgnoreCase(s2));
		System.out.println("equals:" + s1.equalsIgnoreCase(s3));
		System.out.println("-----------------------");


		// boolean startsWith(String str):判断字符串是否以某个指定的字符串开头
		System.out.println("startsWith:" + s1.startsWith("h"));
		System.out.println("startsWith:" + s1.startsWith("hello"));
		System.out.println("startsWith:" + s1.startsWith("world"));
		System.out.println("-----------------------");



		System.out.println("isEmpty:" + s1.isEmpty());

		String s4 = "";
		String s5 = null;
		System.out.println("isEmpty:" + s4.isEmpty());

		System.out.println("isEmpty:" + s5.isEmpty());
	}
}
