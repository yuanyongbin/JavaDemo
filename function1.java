import java.util.Scanner;

class Function1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������һ�����ݣ�");
		int a = sc.nextInt();
		
		System.out.println("������ڶ������ݣ�");
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