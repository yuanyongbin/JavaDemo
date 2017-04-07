/*
	类与类的关系
	类与类
	接口与类
	接口与接口
*/

// 接口类
interface Father{
	public abstract void show();
}

interface Mather{
	public abstract void show2();
}

//接口类 与 类
class Son extends Object implements Father,Mather{
	public void show(){
		System.out.println("叫爸爸");
	}
	public void show2(){
		System.out.println("叫妈妈");
	}
}
// 接口类与接口类
interface Sister extends Father,Mather{} 
// 测试类
class InterfaceDemo3{
	public static void main(String[] args){
		Father son = new Son();
		son.show();
		Mather son2 = new Son();
		son2.show2();
	}
}