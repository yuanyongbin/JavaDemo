/*
	��̬�ı׶ˣ�
		����ʹ����������й��ܡ�
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
		//����
		Fu f = new Zi();
		f.show();
		f.method();
	}
}