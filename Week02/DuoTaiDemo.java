/*
	��̬�ķ����ص�
	
*/


class Fu{
	public int num = 100;
	public void shut(){
		System.out.println("shut Fu");
	}
	public static void function(){
		System.out.println("Function Fu");
	}
}

class Zi extends Fu{
	public int num = 1000;
	public int num2 = 200;
	public void shut(){
		System.out.println("shut Zi");
	}
	public void shut2(){
		System.out.println("shut 2 zi");
	}
	public static void function(){
		System.out.println("Function Zi");
	}
}

class DuoTaiDemo{
	public static void main(String[] rags){
		Fu f = new Zi();
		//Zi z = new Fu();  //����: �����ݵ�����: Fu�޷�ת��ΪZi      Zi z = new Fu();
		//---------------------- ���� --------------------
		System.out.println(f.num);
		//System.out.println(f.num2);  // �Ҳ�������num2
		//----------------------  ���� -------------------
		
		f.shut();   // shut Zi
		//f.shut2();   //  �Ҳ�������shut2
		f.function();
	}
}