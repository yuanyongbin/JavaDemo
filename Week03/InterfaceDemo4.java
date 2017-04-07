//è��������



// ������
abstract class Animal{
	private String name;
	private int age;
	
	public Animal(){}
	public Animal(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public void eat(){
		System.out.println("�Է�");
	}
	// ˯������
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
//�ӿ��� --- �˶�Ա����
interface AthletesAnimal{
	public abstract void athletes(); 
	public abstract void sleep();
	public abstract void eat();
}
//����Сè
class Cat extends Animal{
	public Cat(){}
	public Cat(String name,int age){
		super(name,age);
	}
	public void sleep(){
		System.out.println(super.getName() + "����˯��");
	}
	public void eat(){
		System.out.println(super.getName() + "�����㡣");
	}
}
//���ﹷ��
class Dog extends Animal{
	public Dog(){}
	public Dog(String name,int age){
		super(name,age);
	}
	public void sleep(){
		System.out.println(super.getName() + "����˯��");
	}
	public void eat(){
		System.out.println(super.getName() + "�����⡣");
	}
}
//�˶�Աè
class AthletesCat extends Cat implements AthletesAnimal{
	public AthletesCat(){}
	public AthletesCat (String name,int age){
		super(name,age);
	}
	public void sleep(){
		System.out.println(super.getName() + "����˯��");
	}
	public void eat(){
		System.out.println(super.getName() + "�����㡣");
	}
	public void athletes(){
		System.out.println("����" +super.getName() + "���Ұ��˶����������߹ھ�");
	}
}
// �˶�Ա��
class AthletesDog extends Dog implements AthletesAnimal{
	public AthletesDog(){
		
	}
	public AthletesDog(String name,int age){
		super(name,age);
	}
	public void sleep(){
		System.out.println(super.getName() + "����˯��");
	}
	public void eat(){
		System.out.println(super.getName() + "�����⡣");
	}
	public void athletes(){
		System.out.println("����" +super.getName() + "���Ұ��˶���������ˮ�ھ�");
	}
}
class InterfaceDemo4{
	public static void main(String[] args){
		Animal a = new Cat("������",20);
		a.sleep();
		a.eat();
		System.out.println("------------------");
		Animal b = new Cat();
		b.setName("����ΰ");
		b.setAge(20);
		b.sleep();
		b.eat();
		AthletesAnimal a2 = new AthletesCat("������",20);
		System.out.println("------------------");
		
		//------------
		AthletesCat cat = new AthletesCat("����ΰ",21);
		cat.sleep();
		cat.eat();
		cat.athletes();

		
	}
}