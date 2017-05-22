package cn.BigInteger;

import java.math.BigInteger;

/*
 * BigInteger 类
 * 
 * 构造方法：
 * 		BigInteger(String val) 	
 */
public class BigIntegerDemo {
	public static void main(String[] args) {
		Integer i = new Integer(100);
		System.out.println(i);
		Integer ii = new Integer(Integer.MAX_VALUE);
		System.out.println(ii);
//		Integer iii = new Integer("2147483648");//int类型的字面2147483648超出范围
//		System.out.println(iii);
		
		BigInteger big = new BigInteger("2147483648");
		System.out.println(big);
		
		
	}
}
