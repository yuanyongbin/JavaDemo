/*

	 ������ִ��˳��
	 
		 ��̬�����> ��������>���췽��
		 ��̬������,������ļ��ض�����.(��̬���������ݻ�����ִ��)
		 �����ʼ��֮ǰ����и���ʼ��.
	ִ�н����
		Father�ľ�̬�����
		Son�ľ�̬�����
		Father�Ĺ�������
		Father�Ĺ��췽��
		Son�Ĺ�������
		Son�Ĺ��췽��


*/

class Father {
	static {
		System.out.println("Father�ľ�̬�����");
	}
	{
		System.out.println("Father�Ĺ�������");
	}
	public Father(){
		System.out.println("Father�Ĺ��췽��");
	}
}

class Son extends Father {
	static {
		System.out.println("Son�ľ�̬�����");
	}
	{
		System.out.println("Son�Ĺ�������");
	}
	public Son(){
		System.out.println("Son�Ĺ��췽��");
	}
}


class ExtendsTest{
	public static void main(String[] args){
		Son zi = new Son();
	}
}