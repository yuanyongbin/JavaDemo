package cn.itcast_01;

public class StringBufferDemo {
	public static void main(String[] args){
		//创建StringBuffer对象
		StringBuffer sb = new StringBuffer();
		
		System.out.println("sb :" + sb);
		System.out.println("sb.capacity :" + sb.capacity());
		System.out.println("sb.length :" + sb.length());
		System.out.println("------------------------------------");
		
		//指定容量字符串缓存区对象：
		StringBuffer sb1 = new StringBuffer(50);
		System.out.println("sb1 :" + sb1);
		System.out.println("sb1.capacity :" + sb1.capacity());
		System.out.println("sb1.length :" + sb1.length());
		System.out.println("------------------------------------");
		
		
		//指定字符串缓存区对象：
		StringBuffer sb2 = new StringBuffer("hello");
		System.out.println("sb2 :" + sb2);
		System.out.println("sb2.capacity :" + sb2.capacity());
		System.out.println("sb2.length :" + sb2.length());
		System.out.println("------------------------------------");
	}
}
