/*
	局部内部类；
*/


class Outer {
	private int num = 10;
	public void method() {
		class Inner {
			public void show() {
				System.out.println(num);
			}
		}	
			Inner i = new Inner();
			i.show();
		
	}
}

class InnerClassDemo5{
	public static void main(String[] args){
		Outer o = new Outer();
		o.method();
		
	}
}