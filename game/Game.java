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
		System.out.println("��������Ҫ�µ����ݣ�");
		int test = sc.nextInt();
		while(num != test){
		if(test < num){
			System.out.println("��µ�����С��");
		}
		else if(test > num ){
			System.out.println("��µ����ݴ���");
		}
		test = sc.nextInt();
		}
		System.out.println("��ϲ���ɶ���");

	}
}