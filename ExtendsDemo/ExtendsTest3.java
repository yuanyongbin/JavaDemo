//�̳�


class People {
	String name ;
	int age;
	
	public People(){
		name = "����ϼ";
		age = 18;
	}
	public People(String _name,int _age){
		name = _name;
		age = _age;
	}
	public void getName(String _name){
		name = _name;
	}
	public String setName(){
		return name;
	}
	public void getAge(int _age){
		age = _age;
	}
	public int setAge(){
		return age;
	}
	public void show(){
		System.out.println(name + " ---- " + age);
	}
}

class Student extends People{
	public Student(){
		super();
	}
	public Student(String name,int age){
		super(name,age);
	}
}
class Teacher extends People{
	public Teacher(){
		super();
	}
	public Teacher(String name,int age){
		super(name,age);
	}
}


class ExtendsTest3{
	public static void main(String[] args){
		Student stu = new Student();
		stu.show();
		Student stu2 = new Student();
		stu2.getName("����");
		stu.getAge(22);
		stu2.show();
		Student stu3 = new Student("����",23);
		stu3.show();
	}
}