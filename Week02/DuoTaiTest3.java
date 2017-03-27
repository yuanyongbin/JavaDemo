/*
	看程序写结果:先判断有没有问题，如果没有，写出结果
*/
class Fu {
	public void show() {
		System.out.println("fu show");
	}
}

class Zi extends Fu {
	public void show() {
		System.out.println("zi show");
	}

	public void method() {
		System.out.println("zi method");
	}
}

class DuoTaiTest3 {
	public static void main(String[] args) {
		Fu f = new Zi();
		//找不到符号
		//f.method();
		f.show();
	}
}