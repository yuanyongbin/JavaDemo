package cn.Collection;
//����һ��ѧ����
public class Student {
	//��Ա����
	String name;
	int age;
	
	//���췽����
	Student (){
		this.name = "����ϼ";
		this.age = 18;
	}
	
	Student(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	//������
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
