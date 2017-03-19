/*
	继承中构造方法的关系
		A:子类中所以构造方法默认都会访问父类中的空参构造方法
*/

class Father{
	public Father(){
		System.out.println("Father的无参构造方法");
	}
	public Father(String s){
		System.out.println("Father 的有参构造方法");
	}
}

class Son extends Father{
	public Son(){
		System.out.println("Son的无参构造方法");
	}
	public Son(String s){
		System.out.println("Son的无参构造方法");
	}
}
class ExtendsDemo6{
	public static void main(String[] args){
		Son s = new Son();
		System.out.println("--------------------");
		Son s2 = new Son("林青霞");
	}
}

