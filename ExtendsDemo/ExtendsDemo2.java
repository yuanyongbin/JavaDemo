/*
	java 中继承的特点
		1.单继承，不可以多继承
		2.可以多层继承。
*/

/*
	class Father{}
	class Mother{}
	class Son extends Father,Mother{}  //错误的格式，不可以多继承
*/


//多层继承。

class GrandFather{
	public void show(){
		System.out.println("我是爷爷");

		}
}
class Father extends GrandFather{
	public void method(){
		System.out.println("我是老子");
	}
}

class Son extends Father{
	
}

class ExtendsDemo2{
	public static void  main(String[] args){
		Son s = new Son();
		s.method();
		s.show();
	}
}