/*
	����飺��Java�У�ʹ��{}�������Ĵ����Ϊ����顣
	������λ�ò�ͬ�����Է�Ϊ��
		�ֲ�����飺�ֲ�λ�ã������޶��������������ڡ�
		�������飺�����еĳ�Աλ�ã���{}�������Ĵ��롣ÿ�ε��ù��췽��ִ��ǰ��������ִ�й������顣
			���ã����԰Ѷ�����췽���еĹ�ͬ�������һ��
		��̬����飺 �����Աλ�ã���{}�������Ĵ��룬ֻ��������static����
			���ã�������г�ʼ����
			
		�����⣺
			��̬����顢�������顢���췽����ִ��˳��
			��̬�������ִ�У�Ȼ�������飬����췽����
*/
class Code{
	static{
		System.out.println("���Ǿ�̬�����");
	}
	{
		int x = 10;
		System.out.println(x);
	}
	{
		int y = 10;
		System.out.println(y);
	}
	public Code(){
		System.out.println("����code�Ĺ��캯��");
	}
	{
		int y = 20;
		System.out.println(y);
	}
	static{
		System.out.println("���Ǿ�̬�����2");
	}
}

class CodeDemo{
	public static void main(String[] args){
		//�ֲ������
		{
			int x = 10;
			System.out.println(x);
		}
		//�Ҳ������� x
		//System.out.println(x);
		
		System.out.println("--------------");
		Code code1 = new Code();
		
		Code code2 = new Code();
	}
}