/*继承的代码演示
	由于继承中有一个现象：方法重写。
	所以父类的功能会被子类覆盖掉。
	有些时候，我们不想让子类去覆盖父类的功能，

		final  ：


*/ 

class Fu{
	public final void show(){
		System.out.println("这里是绝密资源，任何人都不能看");
	}
}

class Zi extends Fu{
	public void show(){
		//super.show();
		System.out.println("大家一起玩");
	}
}

class FinalDemo{
	public static void main(String[] args){
		Zi z = new Zi();
		z.show();
	}
}