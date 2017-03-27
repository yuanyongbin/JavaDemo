/*
	多态练习：猫狗案例
*/
class Animal {
	public void eat(){
		System.out.println("吃饭");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("狗吃肉");
	}
	
	public void lookDoor() {
		System.out.println("狗看门");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("猫吃鱼");
	}
	
	public void playGame() {
		System.out.println("猫捉迷藏");
	}
}

class DuoTaiTest {
	public static void main(String[] args) {
		//定义为狗
		Animal a = new Dog();
		a.eat();
		System.out.println("--------------");
		//还原成狗
		Dog d = (Dog)a;
		d.eat();
		d.lookDoor();
		System.out.println("--------------");
		//变成猫
		a = new Cat();
		a.eat();
		System.out.println("--------------");
		//还原成猫
		Cat c = (Cat)a;
		c.eat();
		c.playGame();
		System.out.println("--------------");
		
		//演示错误的内容
		//Dog dd = new Animal();
		//Dog ddd = new Cat();
		//ClassCastException
		//Dog dd = (Dog)a;
	}
}	