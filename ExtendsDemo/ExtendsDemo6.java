/*
	�̳��й��췽���Ĺ�ϵ
		A:���������Թ��췽��Ĭ�϶�����ʸ����еĿղι��췽��
*/

class Father{
	public Father(){
		System.out.println("Father���޲ι��췽��");
	}
	public Father(String s){
		System.out.println("Father ���вι��췽��");
	}
}

class Son extends Father{
	public Son(){
		System.out.println("Son���޲ι��췽��");
	}
	public Son(String s){
		System.out.println("Son���޲ι��췽��");
	}
}
class ExtendsDemo6{
	public static void main(String[] args){
		Son s = new Son();
		System.out.println("--------------------");
		Son s2 = new Son("����ϼ");
	}
}

