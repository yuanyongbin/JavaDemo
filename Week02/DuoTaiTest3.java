/*
	������д���:���ж���û�����⣬���û�У�д�����
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
		//�Ҳ�������
		//f.method();
		f.show();
	}
}