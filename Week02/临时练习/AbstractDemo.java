//���������ϰ;
//�������ʵ������ʵ�Ǿ��������ʵ�ֵ��Ƕ�̬�ķ�ʽ��
//     Animal a = new Cat();
abstract class Animal{
	/*
	//���󷽷���
	public abstract void eat(){			//AbstractDemo.java:4: ����: ���󷽷�����������
		System.out.println("������ ��");  
	}
	*/
	public abstract void eat(); 	//���󷽷�����������
	public Animal(){}                   //�������й��췽��������������ʸ������ݵĳ�ʼ��
	public void sleep(){
		System.out.println("���һ��˯����");
	}
}
//����������-----������
abstract class Dog extends Animal{}     //���������������ǳ�����
//����������-----������ ��������д�������е����г��󷽷� ��
class Cat extends Animal{
	public void eat(){
		System.out.println("è����");
	}
}

class AbstractDemo{
	public static void main(String[] args){
		//Animal a = new Animal();     //AbstractDemo.java:15: ����: Animal�ǳ����; �޷�ʵ����
		//ͨ����̬�ķ���ʵ����
		Animal a = new Cat();
		a.eat();
		Cat c = (Cat)a;
		c.sleep();
		//���н����
		/*
			è����
			���һ��˯����
		*/
	}
}