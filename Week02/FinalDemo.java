/*�̳еĴ�����ʾ
	���ڼ̳�����һ�����󣺷�����д��
	���Ը���Ĺ��ܻᱻ���า�ǵ���
	��Щʱ�����ǲ���������ȥ���Ǹ���Ĺ��ܣ�

		final  ��


*/ 

class Fu{
	public final void show(){
		System.out.println("�����Ǿ�����Դ���κ��˶����ܿ�");
	}
}

class Zi extends Fu{
	public void show(){
		//super.show();
		System.out.println("���һ����");
	}
}

class FinalDemo{
	public static void main(String[] args){
		Zi z = new Zi();
		z.show();
	}
}