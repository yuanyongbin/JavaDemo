//猫狗案例：



// 抽象类
abstract class Animal{
	private String name;
	private int age;
	
	public Animal(){}
	public Animal(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public void eat(){
		System.out.println("吃饭");
	}
	// 睡觉方法
	public abstract void sleep();
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
}
//接口类 --- 运动员动物
interface AthletesAnimal{
	public abstract void athletes(); 
	public abstract void sleep();
	public abstract void eat();
}
//宠物小猫
class Cat extends Animal{
	public Cat(){}
	public Cat(String name,int age){
		super(name,age);
	}
	public void sleep(){
		System.out.println(super.getName() + "爬着睡。");
	}
	public void eat(){
		System.out.println(super.getName() + "爱吃鱼。");
	}
}
//宠物狗狗
class Dog extends Animal{
	public Dog(){}
	public Dog(String name,int age){
		super(name,age);
	}
	public void sleep(){
		System.out.println(super.getName() + "卧着睡。");
	}
	public void eat(){
		System.out.println(super.getName() + "爱吃肉。");
	}
}
//运动员猫
class AthletesCat extends Cat implements AthletesAnimal{
	public AthletesCat(){}
	public AthletesCat (String name,int age){
		super(name,age);
	}
	public void sleep(){
		System.out.println(super.getName() + "爬着睡。");
	}
	public void eat(){
		System.out.println(super.getName() + "爱吃鱼。");
	}
	public void athletes(){
		System.out.println("我是" +super.getName() + "，我爱运动，我是跳高冠军");
	}
}
// 运动员狗
class AthletesDog extends Dog implements AthletesAnimal{
	public AthletesDog(){
		
	}
	public AthletesDog(String name,int age){
		super(name,age);
	}
	public void sleep(){
		System.out.println(super.getName() + "卧着睡。");
	}
	public void eat(){
		System.out.println(super.getName() + "爱吃肉。");
	}
	public void athletes(){
		System.out.println("我是" +super.getName() + "，我爱运动，我是跳水冠军");
	}
}
class InterfaceDemo4{
	public static void main(String[] args){
		Animal a = new Cat("李泽玮",20);
		a.sleep();
		a.eat();
		System.out.println("------------------");
		Animal b = new Cat();
		b.setName("王嘉伟");
		b.setAge(20);
		b.sleep();
		b.eat();
		AthletesAnimal a2 = new AthletesCat("李泽玮",20);
		System.out.println("------------------");
		
		//------------
		AthletesCat cat = new AthletesCat("王嘉伟",21);
		cat.sleep();
		cat.eat();
		cat.athletes();

		
	}
}