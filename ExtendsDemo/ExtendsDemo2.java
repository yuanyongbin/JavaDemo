/*
	java �м̳е��ص�
		1.���̳У������Զ�̳�
		2.���Զ��̳С�
*/

/*
	class Father{}
	class Mother{}
	class Son extends Father,Mother{}  //����ĸ�ʽ�������Զ�̳�
*/


//���̳С�

class GrandFather{
	public void show(){
		System.out.println("����үү");

		}
}
class Father extends GrandFather{
	public void method(){
		System.out.println("��������");
	}
}

class Son extends Father{
	
}

class ExtendsDemo2{
	public static void  main(String[] args){
		Son s = new Son();
		s.method();
		s.show();
	}
}