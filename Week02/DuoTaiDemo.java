/*
	多态的访问特点
	
*/


class Fu{
	public int num = 100;
	public void shut(){
		System.out.println("shut Fu");
	}
	public static void function(){
		System.out.println("Function Fu");
	}
}

class Zi extends Fu{
	public int num = 1000;
	public int num2 = 200;
	public void shut(){
		System.out.println("shut Zi");
	}
	public void shut2(){
		System.out.println("shut 2 zi");
	}
	public static void function(){
		System.out.println("Function Zi");
	}
}

class DuoTaiDemo{
	public static void main(String[] rags){
		Fu f = new Zi();
		//Zi z = new Fu();  //错误: 不兼容的类型: Fu无法转换为Zi      Zi z = new Fu();
		//---------------------- 变量 --------------------
		System.out.println(f.num);
		//System.out.println(f.num2);  // 找不到符号num2
		//----------------------  方法 -------------------
		
		f.shut();   // shut Zi
		//f.shut2();   //  找不到符号shut2
		f.function();
	}
}