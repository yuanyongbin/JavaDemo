/*

*/

import java.util.Scanner;
class num{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[4][4];
		for(int x = 0;x < 4 ; x++){
			int s = x + 1;
			System.out.println("�������" + s + "���ȵ�����");
			for(int y = 0;y < 4 ; y++){ 
				arr[x][y] = sc.nextInt();
			}
		}
int sum2 = 0;
		for(int x = 0;x < 4 ; x++){
			int sum1 = 0;
			
			int s = x + 1;
			System.out.print("��"+ s +"���������ܺ�");
			for(int y = 0;y < 4 ; y++){ 				
				sum1 = sum1 + arr[x][y];
				
			}
			System.out.println(sum1);
			sum2 = sum2 + sum1;
		}
		System.out.print("ȫ�������ܺ�Ϊ" + sum2);
	}
	
}