/*
	��̬��ϰ��è������
*/
class Animal {
	public void eat(){
		System.out.println("�Է�");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("������");
	}
	
	public void lookDoor() {
		System.out.println("������");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("è����");
	}
	
	public void playGame() {
		System.out.println("è׽�Բ�");
	}
}

class DuoTaiTest {
	public static void main(String[] args) {
		//����Ϊ��
		Animal a = new Dog();
		a.eat();
		System.out.println("--------------");
		//��ԭ�ɹ�
		Dog d = (Dog)a;
		d.eat();
		d.lookDoor();
		System.out.println("--------------");
		//���è
		a = new Cat();
		a.eat();
		System.out.println("--------------");
		//��ԭ��è
		Cat c = (Cat)a;
		c.eat();
		c.playGame();
		System.out.println("--------------");
		
		//��ʾ���������
		//Dog dd = new Animal();
		//Dog ddd = new Cat();
		//ClassCastException
		//Dog dd = (Dog)a;
	}
}	