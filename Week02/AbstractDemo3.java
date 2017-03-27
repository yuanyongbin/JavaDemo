
abstract class Fu {

	static abstract void show();
	
	public static void method() {
		System.out.println("method");
	}
}

class Zi extends Fu {
	public void show() {}
}

class AbstractDemo3 {
	public static void main(String[] args) {
		Fu.method();
	}
}