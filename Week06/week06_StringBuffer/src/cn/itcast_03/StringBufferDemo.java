package cn.itcast_03;

public class StringBufferDemo {
	public static void main(String[] args){
		StringBuffer sb = new StringBuffer();
		sb.append("hello").append("world").append("java");
		System.out.println("sb :" + sb);
		
		
		sb.deleteCharAt(2);
		System.out.println("sb :"+sb);
		
		sb.delete(1, 3);
		System.out.println("sb :" + sb);
	}
}
