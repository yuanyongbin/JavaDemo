package cn.itcast_03;

import java.util.Scanner;
public class ScannerDemo {
	public static void main(String[] args) {
		// ��������
		Scanner sc = new Scanner(System.in);

		// ��ȡ����int���͵�ֵ
		// int a = sc.nextInt();
		// int b = sc.nextInt();
		// System.out.println("a:" + a + ",b:" + b);
		// System.out.println("-------------------");

		// ��ȡ����String���͵�ֵ
		// String s1 = sc.nextLine();
		// String s2 = sc.nextLine();
		// System.out.println("s1:" + s1 + ",s2:" + s2);
		// System.out.println("-------------------");

		// �Ȼ�ȡһ���ַ������ڻ�ȡһ��intֵ
		// String s1 = sc.nextLine();
		// int b = sc.nextInt();
		// System.out.println("s1:" + s1 + ",b:" + b);
		// System.out.println("-------------------");

		// �Ȼ�ȡһ��intֵ���ڻ�ȡһ���ַ���
		// int a = sc.nextInt();
		// String s2 = sc.nextLine();
		// System.out.println("a:" + a + ",s2:" + s2);
		// System.out.println("-------------------");

		int a = sc.nextInt();
		Scanner sc2 = new Scanner(System.in);
		String s = sc2.nextLine();
		System.out.println("a:" + a + ",s:" + s);
	}
}
