/*

*/

import java.util.Scanner;
class num{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[4][4];
		for(int x = 0;x < 4 ; x++){
			int s = x + 1;
			System.out.println("请输入第" + s + "季度的数据");
			for(int y = 0;y < 4 ; y++){ 
				arr[x][y] = sc.nextInt();
			}
		}
int sum2 = 0;
		for(int x = 0;x < 4 ; x++){
			int sum1 = 0;
			
			int s = x + 1;
			System.out.print("第"+ s +"季度收入总和");
			for(int y = 0;y < 4 ; y++){ 				
				sum1 = sum1 + arr[x][y];
				
			}
			System.out.println(sum1);
			sum2 = sum2 + sum1;
		}
		System.out.print("全年收入总和为" + sum2);
	}
	
}