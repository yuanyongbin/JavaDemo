
abstract class Animal {
	public int num = 10;
	public final int num2 = 20;

	public Animal() {}
	
	public Animal(String name,int age){}
	
	public abstract void show();
	
	public void method() {
		System.out.println("method");
	}
}

class Dog extends Animal {
	public void show() {
		System.out.println("show Dog");
	}
}

class AbstractDemo2 {
	public static void main(String[] args) {
		//创建对象
		Animal a = new Dog();
		a.num = 100;
		System.out.println(a.num);
		//a.num2 = 200;
		System.out.println(a.num2);
		System.out.println("--------------");
		a.show();
		a.method();
	}
}