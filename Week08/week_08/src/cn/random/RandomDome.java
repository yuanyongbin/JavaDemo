package cn.random;

import java.util.Random;

//Random �ࣺ�������������

public class RandomDome {
	public static void main(String[] args) {
		//û�����ӣ�ÿ�β��������������һ��
		//Random ran = new Random();
		//�����ӣ�ÿ�β������������һ����
		Random ran = new Random(1111);
		
		for (int x = 0; x < 10; x++) {
			int num = ran.nextInt(100);
			System.out.println(num);
			
		}

	}
}
