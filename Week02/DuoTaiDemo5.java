/*
	ClassCastException:类型转换异常
	一般在多态的向下转型中容易出现
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
		//内存中的是狗
		Animal a = new Dog();
		Dog d = (Dog)a;
		
		//内存中是猫
		a = new Cat();
		Cat c = (Cat)a;
		
		//内存中是猫
		Dog dd = (Dog)a; //ClassCastException
	}
}