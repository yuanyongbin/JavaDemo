/*
	ClassCastException:����ת���쳣
	һ���ڶ�̬������ת�������׳���
*/
class Animal {
	public void eat(){}
}

class Dog extends Animal {
	public void eat() {}
	
	public void lookDoor() {
	
	}
}

class Cat extends Animal {
	public void eat() {
	
	}
	
	public void playGame() {
		
	}
}

class DuoTaiDemo5 {
	public static void main(String[] args) {
		//�ڴ��е��ǹ�
		Animal a = new Dog();
		Dog d = (Dog)a;
		
		//�ڴ�����è
		a = new Cat();
		Cat c = (Cat)a;
		
		//�ڴ�����è
		Dog dd = (Dog)a; //ClassCastException
	}
}