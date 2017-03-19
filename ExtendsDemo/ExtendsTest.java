/*

	 代码块的执行顺序
	 
		 静态代码块> 构造代码块>构造方法
		 静态的内容,随着类的加载而加载.(静态代码块的内容会优先执行)
		 子类初始化之前会进行父初始化.
	执行结果：
		Father的静态代码块
		Son的静态代码块
		Father的构造代码块
		Father的构造方法
		Son的构造代码块
		Son的构造方法


*/

class Father {
	static {
		System.out.println("Father的静态代码块");
	}
	{
		System.out.println("Father的构造代码块");
	}
	public Father(){
		System.out.println("Father的构造方法");
	}
}

class Son extends Father {
	static {
		System.out.println("Son的静态代码块");
	}
	{
		System.out.println("Son的构造代码块");
	}
	public Son(){
		System.out.println("Son的构造方法");
	}
}


class ExtendsTest{
	public static void main(String[] args){
		Son zi = new Son();
	}
}