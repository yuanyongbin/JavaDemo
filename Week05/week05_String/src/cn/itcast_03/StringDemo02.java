package cn.itcast_03;

import java.util.Scanner;

public class StringDemo02 {
	public static void main(String[] args) {
		// �����û��������롣�Ѵ��ڵġ�
		String username = "admin";
		String password = "admin";

		for (int x = 0; x < 3; x++) {
			// x=0,1,2
			// ����¼���û��������롣
			Scanner sc = new Scanner(System.in);
			System.out.println("�������û�����");
			String name = sc.nextLine();
			System.out.println("���������룺");
			String pwd = sc.nextLine();

			// �Ƚ��û��������롣
			if (name.equals(username) && pwd.equals(password)) {
				// �������ͬ�����¼�ɹ�
				System.out.println("��¼�ɹ�,��ʼ����Ϸ");
				//��������Ϸ
				GuessNumberGame.start();
				break;
			} else {
				if ((2 - x) == 0) {
					System.out.println("�ʺű�����������೤��ϵ");
				} else {
					System.out.println("��¼ʧ�ܣ��㻹��" + (2 - x) + "�λ���");
				}
			}
		}
	}
}
