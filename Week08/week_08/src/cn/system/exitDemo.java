package cn.system;

//��ֹJava�����

public class exitDemo {
	public static void main(String[] args) {
//		System.out.println("����ϲ������ϼ");
//		System.exit(0);
//		System.out.println("�Ҳ�ϲ����������");
		
		long srart = System.currentTimeMillis();
		for(int x = 0;x<100000;x++){
			System.out.println("hello " + x);
		}
		long end = System.currentTimeMillis();
		System.out.println("�����ģ�" + (end - srart) + "����");
	}
}
