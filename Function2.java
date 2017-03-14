import java.util.Scanner;
class Finction2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入第一个数据：");
		int a = sc.nextInt();
		
		System.out.println("请输入第一个数据：");
		int b = sc.nextInt();
		
		if(compare(a ,b )){
			System.out.println("两个数据相等");
		}else{
			System.out.println("两个数据不相等");
		}
	}
	public static boolean compare(int a ,int b ){
		if (a == b ){
			return true;
		}else{
			return false;
		}
		
	}
	
}