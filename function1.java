import java.util.Scanner;

class Function1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入第一个数据：");
		int a = sc.nextInt();
		
		System.out.println("请输入第二个数据：");
		int b = sc.nextInt();
		System.out.println(getMax(a,b));
		
	}
	public static int getMax(int a,int b){
		if(a>b){
			return a;
		}
		else{
			return b;
		}
	}
	
}