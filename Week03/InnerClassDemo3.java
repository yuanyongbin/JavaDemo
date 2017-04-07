/*
	成员内部类:
*/
class Outer {
	private int num = 10;
	
	class Inner {
		public void show() {
			System.out.println(num);
		}
	}
}

class InnerClassDemo3 {
	public static void main(String[] args) {
		Outer.Inner oi = new Outer().new Inner();
		oi.show();
	}
}