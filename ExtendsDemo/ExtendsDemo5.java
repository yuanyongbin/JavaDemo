/*
	super 的使用。
*/


class GrandFather{
	int num = 10;
}

class Father extends GrandFather{
	int num = 20;
}

class Son extends Father {
	int num = 30;
	public void Show(){
		int num = 40;
		System.out.println(num);
		System.out.println(this.num);
		System.out.println(super.num);
	}
}

class ExtendsDemo5{
	public static void main(String[] args){
		//创建对象
		Son s = new Son();
		s.Show();
	}
}

