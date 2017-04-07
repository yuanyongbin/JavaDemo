/*
	成员内部类修饰符：
		private:保证安全性
		static ：为了方便访问数据
			注意：静态内部类访问的外部类数据必须用静态修饰
			内部类用静态修饰符是因为内部类可以看成是外部类的成员
	
	
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
		// 错误: 限定的新静态类
		//Outer.Inner oi2 = new Outer().new Inner();
		//io2.show3();
		Outer.Inner oi = new Outer.Inner();
		oi.show();
		oi.show2();
		
		//show的另一种调用方法：
		Outer.Inner.show2();
	}
}