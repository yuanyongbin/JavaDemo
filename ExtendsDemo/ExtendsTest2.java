// 练习




class Teacher extends People{

	String name ;
	int age;
	
	public Teacher(){
		name = "刘意";
		age = 20;
	}
	public Teacher(String _name,int _age){
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

class Student {
	String name ;
	int age;
	
	public Student(){
		name = "林青霞";
		age = 18;
	}
	public Student(String _name,int _age){
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


class ExtendsTest2{
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