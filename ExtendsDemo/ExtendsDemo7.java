/*
	父类没有无参构造方法的情况
*/

class Father {
	/*
	public Father(){
		System.out.println("Father的无参构造方法");
	}
	*/
	public Father(String s){
		System.out.println("Father的有参构造方法");
	}
}

class Son extends Father{
	public Son(){
		super("林青霞");    //通过使用super关键字去显示的调用父类的带参构造方法
		System.out.println("Son的无参构造方法");
	}
	public Son(String s){
		//super("林青霞");  //通过使用super关键字去显示的调用父类的带参构造方法
		this();             //子类通过this去调用本类的其他构造方法
		System.out.println("Son的有参构造方法");
	}
}

class ExtendsDemo7{
	public static void main(String[] args){
		Son son = new Son();
		System.out.println("-----------------------------");
		Son son2 = new Son("林青霞");
	}
}
