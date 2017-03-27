/*
	多态的弊端：
		不能使用子类的特有功能。
*/
class Fu {
	public void show() {
		System.out.println("show fu");
	}
}

class Zi extends Fu {
	public void show() {
		System.out.println("show zi");
	}
	
	public void method() {
		System.out.println("method zi");
	}

}

class DuoTaiDemo3 {
	public static void main(String[] args) {
		//测试
		Fu f = new Zi();
		f.show();
		f.method();
	}
}