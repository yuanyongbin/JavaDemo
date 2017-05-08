package cn.itcast_01;
/*
 * JDK 的新特性:
 * 	自动装箱:
 * 	自动拆箱:
 * 
 *   注意:Integer ii = NULL;代码会出现空置针异常
 */
public class IntegerDemo {
	public static void main(String[] args){
		Integer ii = 100;
		ii += 200;
		System.out.println("ii :" + ii);
	}
}
