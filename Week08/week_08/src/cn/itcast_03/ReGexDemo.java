package cn.itcast_03;

import java.util.Scanner;

//У���ֻ����Ƿ�����ҵĹ��
public class ReGexDemo {
	public static void main(String[] args) {
		//����¼���ֻ���
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���绰����");
		String phone = sc.nextLine();
		
		//����������ʽ
		String regex = "1[38]\\d{9}";
		
		boolean flag = phone.matches(regex);
		System.out.println("flaf : " + flag);
	}
}
