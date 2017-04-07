/*
	形式参数
	
*/

class Student{
	public void study(){
		System.out.println("Good Good Study,Day Day Up!!!");
	}
}
class StudentDemo{
	public void method(Student s){
		s.study();
	};
}

class StudentTest{
	public static void main(String[] args){
		Student s = new Student();
		s.study();
		System.out.println("-----------------------");
		StudentDemo sd = new StudentDemo();
		Student ss = new Student();
		sd.method(ss);
	}
}