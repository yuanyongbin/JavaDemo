/*
	��̬��ά����
*/
//������----����
class Animal{
	public void eat(){
		System.out.println("eat");
	}
	public void sleep(){
		System.out.println("sleep");
	}
}
// ����----������
class Dog extends Animal{
	public void eat(){
		System.out.println("����ʺ");
	}
	public void sleep(){
		System.out.println("��վ��˯��");
	}
}
//è��----������
class Cat extends Animal{
	public void eat(){
		System.out.println("è����");
	}
	public void sleep(){
		System.out.println("èվ��˯��");
	}
}

//������
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