/*
	��Ա�ڲ������η���
		private:��֤��ȫ��
		static ��Ϊ�˷����������
			ע�⣺��̬�ڲ�����ʵ��ⲿ�����ݱ����þ�̬����
			�ڲ����þ�̬���η�����Ϊ�ڲ�����Կ������ⲿ��ĳ�Ա
	
	
*/
class Outer{
	private int num = 10;
	static int num2 = 100;
	public static class Inner{
		public void show(){
			System.out.println(num2);
		}
		public static void show2(){
			System.out.println(num2);
		}
	}
	public  class Inner2{
		public void show3(){
			System.out.println(num2);
		}
	}
}
class InnerClassDemo4{
	public static void main(String[] args){
		// ����: �޶����¾�̬��
		//Outer.Inner oi2 = new Outer().new Inner();
		//io2.show3();
		Outer.Inner oi = new Outer.Inner();
		oi.show();
		oi.show2();
		
		//show����һ�ֵ��÷�����
		Outer.Inner.show2();
	}
}