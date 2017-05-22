package cn.ArrayStuent;
//测试类
public class ArrayStudentDemo {
	public static void main(String[] args) {
		Student st1 = new Student("林青霞",28);
		Student st2 = new Student("李泽玮",22);
		Student st3 = new Student("王嘉伟",22);
		
		
		Student[] array = new Student[3];
		array[0] = st1;
		array[1] = st2;
		array[2] = st3;
		
		for(int x=0;x < array.length;x++){
			array[x].toStirng();
		}
	}
}
