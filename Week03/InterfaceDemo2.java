/*
	�ӿ����Ա�ص�
*/


interface Inter{
	public int num = 10;
	public final int num2 = 20;
	public static final int num3 = 30;
	
	//��Ա������
	//void show(){}           //InterfaceDemo2.java:12: ����: �ӿڳ��󷽷����ܴ�������
	//abstract void show();   
	public abstract void show();
}

class InterImpl implements Inter{
	//void show(){              //���ڳ��Է�����͵ķ���Ȩ��; ��ǰΪpublic
	//	System.out.println("INterImpl show");
	//}
	public void show(){
		System.out.println("INterImpl show");
	}
}
class InterfaceDemo2{
	public static void main(String[] args){
		Inter in = new InterImpl();
		System.out.println(in.num);   //10
		System.out.println(in.num2);  //20
		System.out.println(in.num3);  //30
		System.out.println(Inter.num);//10
		in.show();
	}
}