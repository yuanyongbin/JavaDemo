/*
	����û���޲ι��췽�������
*/

class Father {
	/*
	public Father(){
		System.out.println("Father���޲ι��췽��");
	}
	*/
	public Father(String s){
		System.out.println("Father���вι��췽��");
	}
}

class Son extends Father{
	public Son(){
		super("����ϼ");    //ͨ��ʹ��super�ؼ���ȥ��ʾ�ĵ��ø���Ĵ��ι��췽��
		System.out.println("Son���޲ι��췽��");
	}
	public Son(String s){
		//super("����ϼ");  //ͨ��ʹ��super�ؼ���ȥ��ʾ�ĵ��ø���Ĵ��ι��췽��
		this();             //����ͨ��thisȥ���ñ�����������췽��
		System.out.println("Son���вι��췽��");
	}
}

class ExtendsDemo7{
	public static void main(String[] args){
		Son son = new Son();
		System.out.println("-----------------------------");
		Son son2 = new Son("����ϼ");
	}
}
