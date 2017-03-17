import java.util.Scanner;
class GameDemo{
	public static void main(String[] args){
		int number = (int)(Math.random() * 100 ) + 1;
		Function.ArrayNumber(number);
	}
}
class Function{
	public static void ArrayNumber(int num){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你要猜的数据：");
		int test = sc.nextInt();
		while(num != test){
		if(test < num){
			System.out.println("你猜的数据小了");
		}
		else if(test > num ){
			System.out.println("你猜的数据大了");
		}
		test = sc.nextInt();
		}
		System.out.println("恭喜你蒙对了");

	}
}