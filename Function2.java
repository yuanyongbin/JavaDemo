import java.util.Scanner;
class Finction2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������һ�����ݣ�");
		int a = sc.nextInt();
		
		System.out.println("�������һ�����ݣ�");
		int b = sc.nextInt();
		
		if(compare(a ,b )){
			System.out.println("�����������");
		}else{
			System.out.println("�������ݲ����");
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