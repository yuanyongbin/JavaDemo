package cn.itcast_02;

public class Student {
	private String name;
	private int age = 1;
	public int nem =2;
	public final int num2 = 2;
	public static int num3 = 2;
	public static final int num4 = 2; 
	public Student(){
		
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}	
}
