package cn.itcast_07;


public class StringBufferTest {
	public static void main(String[] args) {
		// String -- StringBuffer
		String s = "hello";

		StringBuffer sb = new StringBuffer(s);
		StringBuffer sb2 = new StringBuffer();
		sb2.append(s);
		System.out.println("sb:" + sb);
		System.out.println("sb2:" + sb2);
		System.out.println("---------------");

		// StringBuffer -- String
		StringBuffer buffer = new StringBuffer("java");
		// String(StringBuffer buffer)
		// ��ʽ1:ͨ�����췽��
		String str = new String(buffer);
		// ��ʽ2��ͨ��toString()����
		String str2 = buffer.toString();
		System.out.println("str:" + str);
		System.out.println("str2:" + str2);
	}
}
