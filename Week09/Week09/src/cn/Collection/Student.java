package cn.Collection;
//创建一个学生类
public class Student {
	//成员变量
	String name;
	int age;
	
	//构造方法；
	Student (){
		this.name = "林青霞";
		this.age = 18;
	}
	
	Student(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	//方法：
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
//	public void toStirng(){
//		System.out.println(getName()+ "----" + getAge());
//	}
}
