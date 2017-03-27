
//�������Ķ�����
abstract class Animal {
	//����
	private String name;
	//����
	private int age;
	
	public Animal() {}
	
	public Animal(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	//����һ�����󷽷�
	public abstract void eat();
}

//�������Ĺ���
class Dog extends Animal {
	public Dog() {}
	
	public Dog(String name,int age) {
		super(name,age);
	}
	
	public void eat() {
		System.out.println("������");
	}
}

//��������è��
class Cat extends Animal {
	public Cat() {}
	
	public Cat(String name,int age) {
		super(name,age);
	}
	
	public void eat() {
		System.out.println("è����");
	}
}

//������
class AbstractTest {
	public static void main(String[] args) {
		//���Թ���
		//�������÷�
		//��ʽ1��
		Dog d = new Dog();
		d.setName("����");
		d.setAge(3);
		System.out.println(d.getName()+"---"+d.getAge());
		d.eat();
		//��ʽ2��
		Dog d2 = new Dog("����",3);
		System.out.println(d2.getName()+"---"+d2.getAge());
		d2.eat();
		System.out.println("---------------------------");
		
		Animal a = new Dog();
		a.setName("����");
		a.setAge(3);
		System.out.println(a.getName()+"---"+a.getAge());
		a.eat();
		
		Animal a2 = new Dog("����",3);
		System.out.println(a2.getName()+"---"+a2.getAge());
		a2.eat();
		
		//��ϰ������è��
	}
}