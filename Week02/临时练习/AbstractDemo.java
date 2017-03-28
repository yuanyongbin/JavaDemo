//抽象类的练习;
//抽象类的实例化其实是具体的子类实现的是多态的方式：
//     Animal a = new Cat();
abstract class Animal{
	/*
	//抽象方法：
	public abstract void eat(){			//AbstractDemo.java:4: 错误: 抽象方法不能有主体
		System.out.println("抽象类 吃");  
	}
	*/
	public abstract void eat(); 	//抽象方法不能有主体
	public Animal(){}                   //抽象类有构造方法，用于子类访问父类数据的初始化
	public void sleep(){
		System.out.println("大家一起睡觉觉");
	}
}
//抽象类子类-----抽象类
abstract class Dog extends Animal{}     //抽象类的子类可以是抽象类
//抽象类子类-----具体类 （必须重写抽象类中的所有抽象方法 ）
class Cat extends Animal{
	public void eat(){
		System.out.println("猫吃鱼");
	}
}

class AbstractDemo{
	public static void main(String[] args){
		//Animal a = new Animal();     //AbstractDemo.java:15: 错误: Animal是抽象的; 无法实例化
		//通过多态的方法实例化
		Animal a = new Cat();
		a.eat();
		Cat c = (Cat)a;
		c.sleep();
		//运行结果：
		/*
			猫吃鱼
			大家一起睡觉觉
		*/
	}
}