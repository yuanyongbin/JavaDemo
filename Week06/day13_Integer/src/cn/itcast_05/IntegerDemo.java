package cn.itcast_05;


public class IntegerDemo {
	public static void main(String[] args) {
		// ������һ��int���͵İ�װ�����ͱ���i
		// Integer i = new Integer(100);
		Integer ii = 100;
		ii += 200;
		System.out.println("ii:" + ii);
		Integer iii = null;
		// NullPointerException
		if (iii != null) {
			iii += 1000;
			System.out.println(iii);
		}
	}
}
