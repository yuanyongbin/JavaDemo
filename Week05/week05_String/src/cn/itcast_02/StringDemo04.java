package cn.itcast_02;
import java.util.Scanner;

public class StringDemo04 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "world";
		String s3 = "helloworld";
		System.out.println(s3 == s1 + s2);// false
		System.out.println(s3.equals((s1 + s2)));// true

		System.out.println(s3 == "hello" + "world");// false ������Ǵ��ˣ�Ӧ����true
		System.out.println(s3.equals("hello" + "world"));// true
	}
}
