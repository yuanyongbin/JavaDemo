/*
	�̳еĸ���
*/

class Person{
	public void eat(){
		System.out.println("�Է�");
	}
	public void sleep(){
			System.out.println("˯��");
	}
}

class Person2{}

class Student extends Person{}
//class Student extends Person2{}
class Teacher extends Person{}

class ExtendsDemo{
	public static void main(String[] args){
		Student s = new Student();
		s.eat();
		s.sleep();
		System.out.println("---------------------");
		Student s2 = new  Student();
		s2.eat();
		s2.sleep();
	}
}