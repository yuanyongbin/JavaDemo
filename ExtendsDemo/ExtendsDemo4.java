/*
	�̳��г�Ա����֮��Ĺ�ϵ��
*/

class Father {
	int num = 10;
	
}

class Son extends Father{
	int num2 = 20;
	int num = 30;
	public void show(){
		int num = 40;
		System.out.println(num);
		System.out.println(num2);
	}
}

class ExtendsDemo4{
	public static void main(String[] args){
		//��������
		Son s = new Son();
		s.show();
	}
}