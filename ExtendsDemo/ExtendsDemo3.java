/*
	�̳е�ע�����
		A:����ֻ�ܼ̳и������Է�˽�г�Ա����Ա�����ͳ�Ա������
*/

class Father{
	private int num = 10;
	public int num2 = 20;
	private void method(){
		System.out.println(num);
		System.out.println(num2);
	}
	public void show(){
		System.out.println(num);
		System.out.println(num2);		
	}
}

class Son extends Father {
	
}

class ExtendsDemo3{
	public static void main(String[] args){
		Son s = new Son();
		s.show();
		//s.method();  
		//����ֻ�ܼ̳и������Է�˽�г�Ա����Ա�����ͳ�Ա������
		
	}
}