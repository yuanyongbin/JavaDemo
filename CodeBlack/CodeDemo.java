/*
	代码块：在Java中，使用{}括起来的代码称为代码块。
	根据其位置不同，可以分为：
		局部代码块：局部位置，用于限定变量的生命周期。
		构造代码块：在类中的成员位置，用{}括起来的代码。每次调用构造方法执行前，都会先执行构造代码块。
			作用：可以把多个构造方法中的共同代码放在一起。
		静态代码块： 在类成员位置，用{}括起来的代码，只不过他用static修饰
			作用：对类进行初始化。
			
		面试题：
			静态代码块、构造代码块、构造方法的执行顺序？
			静态代码块先执行，然后构造代码块，最后构造方法。
*/
class Code{
	static{
		System.out.println("我是静态代码块");
	}
	{
		int x = 10;
		System.out.println(x);
	}
	{
		int y = 10;
		System.out.println(y);
	}
	public Code(){
		System.out.println("我是code的构造函数");
	}
	{
		int y = 20;
		System.out.println(y);
	}
	static{
		System.out.println("我是静态代码块2");
	}
}

class CodeDemo{
	public static void main(String[] args){
		//局部代码块
		{
			int x = 10;
			System.out.println(x);
		}
		//找不到符号 x
		//System.out.println(x);
		
		System.out.println("--------------");
		Code code1 = new Code();
		
		Code code2 = new Code();
	}
}