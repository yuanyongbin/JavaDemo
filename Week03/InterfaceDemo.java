/*
	接口特点：
		接口用关键字interface表示
			interface 接口名{}
		类实现接口用 implements 表示
			class 类名 implements 接口名{}
		接口不能实例化
			那么，接口怎么实例化呢？
			安多态的方法类实例化
		接口的子类
			可以是抽象类。（意义不大）
			可以是具体类，但是要求写接口类中的所有抽象方法（推荐方案）
	
	由此可见；
		具体类多态（几乎不用）
		抽象类多态（常用）
		接口多态（最常用）
		
*/

//定义动物培训接口
interface AnimalTrain{
	public abstract void jump();
}

//抽象类实现接口
abstract class  Dog implements AnimalTrain{
	
}

class Cat implements AnimalTrain{
	public void jump(){
		System.out.println("猫可以跳高了");
	}
}

class InterfaceDemo{
	public static void main(String[] args){
		//AnimalTrain at = new AnimalTrain(); //InterfaceDemo.java:29: 错误: AnimalTrain是抽象的; 无法实例化
		//at.jump();
		AnimalTrain cart = new Cat();
		cat.jump();
		
	}
}