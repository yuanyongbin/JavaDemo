package cn.itcast_04;

import com.sun.org.apache.xml.internal.serializer.ToStream;

public class Student implements Cloneable{
	String name;
	int age;
	public Student(){}
	public Student(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void SetAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}

	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	

}
