/*
	������Ĺ�ϵ
	������
	�ӿ�����
	�ӿ���ӿ�
*/

// �ӿ���
interface Father{
	public abstract void show();
}

interface Mather{
	public abstract void show2();
}

//�ӿ��� �� ��
class Son extends Object implements Father,Mather{
	public void show(){
		System.out.println("�аְ�");
	}
	public void show2(){
		System.out.println("������");
	}
}
// �ӿ�����ӿ���
interface Sister extends Father,Mather{} 
// ������
class InterfaceDemo3{
	public static void main(String[] args){
		Father son = new Son();
		son.show();
		Mather son2 = new Son();
		son2.show2();
	}
}