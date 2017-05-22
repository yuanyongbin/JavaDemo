package cn.BigInteger;

import java.math.BigInteger;

/*
 * public BigInteger add(BigInteger val):加
 * public BigInteger subtract(BigInteger val):减
 * public BigInteger multiply(BigInteger val):乘
 * public BigInteger divide(BigInteger val):除
 * public BigInteger[] divideAndRemainder(BigInteger val):返回商和余数的数组
 */
public class BigIntegerDemo_02 {
	public static void main(String[] args) {
		BigInteger big = new BigInteger("100");
		BigInteger big2 = new BigInteger("50");
		
		System.out.println("add : " + big.add(big2));
		System.out.println("subtracy : " + big.subtract(big2));
		System.out.println("multiply : " + big.multiply(big2));
		System.out.println("divide : " + big.divide(big2));
		
		BigInteger[] big3 = big.divideAndRemainder(big2);
		System.out.println("商 ：" + big3[0]);
		System.out.println("余数 ：" + big3[1]);
	}
}
