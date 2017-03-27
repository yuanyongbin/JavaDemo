

//abstract class Animal //抽象类的声明格式
abstract class Animal {
	//抽象方法
	//public abstract void eat(){} //空方法体,这个会报错。抽象方法不能有主体
	public abstract void eat();
	
	public Animal(){}
}

//子类是抽象类
abstract class Dog extends Animal {}

//子类是具体类，重写抽象方法
class Cat extends Animal {
	public void eat() {
		System.out.println("猫吃鱼");
	}
}

class AbstractDemo {
	public static void main(String[] args) {
		//创建对象
		//Animal是抽象的; 无法实例化
		//Animal a = new Animal();
		//通过多态的方式
		Animal a = new Cat();
		a.eat();
	}
}