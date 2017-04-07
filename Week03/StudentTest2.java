//返回值类型：


class Student{
	public void study(){
		System.out.println("Good Good Study , Day Day Up!!!");
	}
}

class StudentDemo{
	public Student getStudent(){
		return new Student();
	}
	
}
class StudentTest2{
	public static void main(String[] args){
		StudentDemo s = new StudentDemo();
		Student ss = s.getStudent();
		ss.study();
	}
}