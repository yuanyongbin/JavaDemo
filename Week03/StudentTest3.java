//Á´Ê½±à³Ì£º


class Student{
	public void study(){
		System.out.println("Good Good study, Day Day Up !!!");
	}
}

class StudentDemo {
	public Student getStudent() {
		return new Student();
	}
}

class StudentTest3{
	public static void main(String[] args){
		StudentDemo sd = new StudentDemo();
		sd.getStudent().study();
	}
}