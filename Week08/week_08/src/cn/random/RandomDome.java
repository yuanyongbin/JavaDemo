package cn.random;

import java.util.Random;

//Random 类：产生随机数的类

public class RandomDome {
	public static void main(String[] args) {
		//没有种子，每次产生的随机数都不一样
		//Random ran = new Random();
		//有种子，每次产生的随机数都一样：
		Random ran = new Random(1111);
		
		for (int x = 0; x < 10; x++) {
			int num = ran.nextInt(100);
			System.out.println(num);
			
		}

	}
}
