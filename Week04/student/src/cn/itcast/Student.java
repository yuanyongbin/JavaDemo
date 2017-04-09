package cn.itcast;

public class Student {
	//ĞÕÃû
	private String name;
	//ÄêÁä
	private int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Student(){
		
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	public void show(){
		System.out.println(getName() + " " + getAge());
	}
	
}
