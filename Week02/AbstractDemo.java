

//abstract class Animal //�������������ʽ
abstract class Animal {
	//���󷽷�
	//public abstract void eat(){} //�շ�����,����ᱨ�����󷽷�����������
	public abstract void eat();
	
	public Animal(){}
}

//�����ǳ�����
abstract class Dog extends Animal {}

//�����Ǿ����࣬��д���󷽷�
class Cat extends Animal {
	public void eat() {
		System.out.println("è����");
	}
}

class AbstractDemo {
	public static void main(String[] args) {
		//��������
		//Animal�ǳ����; �޷�ʵ����
		//Animal a = new Animal();
		//ͨ����̬�ķ�ʽ
		Animal a = new Cat();
		a.eat();
	}
}