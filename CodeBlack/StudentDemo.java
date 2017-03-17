/*
输出结果：

		林青霞都60岁了，我很伤心。
		我是main() 方法。
		Student 静态代码块
		Student 构造代码块
		Student 构造方法

*/

class Student{
	static {
		System.out.println("Student 静态代码块");
	}
	{
		System.out.println("Student 构造代码块");
	}
	public Student(){
		System.out.println("Student 构造方法");
	}	
}

class StudentDemo{
	static {
			System.out.println("林青霞都60岁了，我很伤心。");
		}
	public static void main(String[] args){
		System.out.println("我是main() 方法。");
		Student sta = new Student();
	}
}