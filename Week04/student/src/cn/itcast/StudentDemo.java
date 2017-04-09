package cn.itcast;

public class StudentDemo {
	public static void main(String[] age){
		//创建对象
		Student s = new Student("李泽玮",22);
		s.show();
		//创建对象二
		Student s2 = new Student();
		s2.setName("王嘉伟");
		s2.setAge(22);
		s2.show();
	}
}
