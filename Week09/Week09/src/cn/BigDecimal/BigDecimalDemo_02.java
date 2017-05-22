package cn.BigDecimal;

import java.math.BigDecimal;

//BigDecimal类：不可变的、任意精度的有符号十进制数
/*
 * 构造方法：
 * 		public BigDecimal(String val)
 * 
 * public BigDecimal add(BigDecimal augend)
 * public BigDecimal subtract(BigDecimal subtrahend)
 * public BigDecimal multiply(BigDecimal multiplicand)
 * public BigDecimal divide(BigDecimal divisor)
 * public BigDecimal divide(BigDecimal divisor,int scale,int roundingMode):商，几位小数，如何舍取
 */
public class BigDecimalDemo_02 {
	public static void main(String[] args) {
		BigDecimal bd1 = new BigDecimal("0.09");
		BigDecimal bd2 = new BigDecimal("0.01");
		System.out.println("add : " + bd1.add(bd2));
		System.out.println("-----------------------------");
		System.out.println(0.09 + 0.01);
	}
}
