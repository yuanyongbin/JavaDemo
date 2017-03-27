/*
	多态的维护性
*/
//动物类----基类
class Animal{
	public void eat(){
		System.out.println("eat");
	}
	public void sleep(){
		System.out.println("sleep");
	}
}
// 狗类----派生类
class Dog extends Animal{
	public void eat(){
		System.out.println("狗吃屎");
	}
	public void sleep(){
		System.out.println("狗站着睡觉");
	}
}
//猫类----派生类
class Cat extends Animal{
	public void eat(){
		System.out.println("猫吃鱼");
	}
	public void sleep(){
		System.out.println("猫站着睡觉");
	}
}

//方法类
class AnimalTool{
	public static void useAnimal(Animal a){
		a.eat();
		a.sleep();
	}
}

class DuoTaiDemo2{
	public static void main(String[] args){
		Animal d = new Dog();
		d.eat();
		d.sleep();
		
		
		System.out.println("------------------------------");
		Animal c = new Cat();
		AnimalTool.useAnimal(c);
	}
}