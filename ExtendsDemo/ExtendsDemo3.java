/*
	继承的注意事项：
		A:子类只能继承父类所以非私有成员（成员方法和成员变量）
*/

class Father{
	private int num = 10;
	public int num2 = 20;
	private void method(){
		System.out.println(num);
		System.out.println(num2);
	}
	public void show(){
		System.out.println(num);
		System.out.println(num2);		
	}
}

class Son extends Father {
	
}

class ExtendsDemo3{
	public static void main(String[] args){
		Son s = new Son();
		s.show();
		//s.method();  
		//子类只能继承父类所以非私有成员（成员方法和成员变量）
		
	}
}