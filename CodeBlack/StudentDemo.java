/*
��������

		����ϼ��60���ˣ��Һ����ġ�
		����main() ������
		Student ��̬�����
		Student ��������
		Student ���췽��

*/

class Student{
	static {
		System.out.println("Student ��̬�����");
	}
	{
		System.out.println("Student ��������");
	}
	public Student(){
		System.out.println("Student ���췽��");
	}	
}

class StudentDemo{
	static {
			System.out.println("����ϼ��60���ˣ��Һ����ġ�");
		}
	public static void main(String[] args){
		System.out.println("����main() ������");
		Student sta = new Student();
	}
}