//抽象类作为形式参数

abstract class Person{
	public abstract void study();
}

class PersonDemo{
	public void method(Person p){
		p.study();
	}
}

class Student extends Person{
	public void study(){
		System.out.println("Good Good Study , Day Day Up");
	}
}
class PersonTest{
	public static void main(String[] args){
		PersonDemo pp = new PersonDemo();
		Person p = new Student();
		pp.method(p);
	}
}