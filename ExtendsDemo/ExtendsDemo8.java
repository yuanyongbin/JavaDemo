/*
	������д��ע�����
		������д��ע������
		A:������˽�з������ܱ���д
			��Ϊ����˽�з�������������޷��̳�
		B:������д���෽��ʱ������Ȩ�޲��ܸ���
			��þ�һ��
		C:���ྲ̬����������Ҳ����ͨ����̬����������д
			
			
		������д���෽����ʱ���������һģһ����
*/


class Father {
	//private void show() {}
	
	/*
	public void show() {
		System.out.println("show Father");
	}
	*/
	
	void show() {
		System.out.println("show Father");
	}
	/*
	public static void method() {
		
	}
	*/
	
	public static void method() {
		
	}
}

class Son extends Father {
	//private void show() {}

	/*
	public void show() {
		System.out.println("show Son");
	}
	*/
	
	public void show() {
		System.out.println("show Son");
	}
	
	
	public static void method() {
	
	}
	
	/*
	public void method() {
	
	}
	*/
}

class ExtendsDemo8{
	public static void main(String[] args) {
		Son s = new Son();
		s.show();
	}
}