package cn.itcast;

public class StudentDemo {
	public static void main(String[] age){
		//��������
		Student s = new Student("������",22);
		s.show();
		//���������
		Student s2 = new Student();
		s2.setName("����ΰ");
		s2.setAge(22);
		s2.show();
	}
}
