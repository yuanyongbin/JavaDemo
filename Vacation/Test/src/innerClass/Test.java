package innerClass;



//内部类 访问外部类的私有部分
public class Test {
	public static void main(String[] args) {
		new Testce().printr(); 
	}
}

class Testce{
	private int a;
	
	public Testce(){
		a = 100;
	}
	
	public void printr(){
		new Testnie().prin();
	}
	public class Testnie {
		int b;
		public Testnie(){
			b = a;
		}
		
		public void prin(){
			System.out.println(b);
		}
	}
}
