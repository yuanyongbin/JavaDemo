/*
	接口类成员特点
*/


interface Inter{
	public int num = 10;
	public final int num2 = 20;
	public static final int num3 = 30;
	
	//成员方法：
	//void show(){}           //InterfaceDemo2.java:12: 错误: 接口抽象方法不能带有主体
	//abstract void show();   
	public abstract void show();
}

class InterImpl implements Inter{
	//void show(){              //正在尝试分配更低的访问权限; 以前为public
	//	System.out.println("INterImpl show");
	//}
	public void show(){
		System.out.println("INterImpl show");
	}
}
class InterfaceDemo2{
	public static void main(String[] args){
		Inter in = new InterImpl();
		System.out.println(in.num);   //10
		System.out.println(in.num2);  //20
		System.out.println(in.num3);  //30
		System.out.println(Inter.num);//10
		in.show();
	}
}