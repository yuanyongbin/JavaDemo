//继承


class People {
	String name ;
	int age;
	
	public People(){
		name = "林青霞";
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
		stu2.getName("张三");
		stu.getAge(22);
		stu2.show();
		Student stu3 = new Student("李四",23);
		stu3.show();
	}
}