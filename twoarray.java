import java.util.Scanner;
class twoarray{
	public static void main(String[] args){
		int[][] arr = new int[3][3];
		for(int x = 0;x < 3;x++){
			for(int y = 0;y<3;y++){
				Scanner sc = new Scanner(System.in);
				arr[x][y] = sc.nextInt();
			}
		}
		for(int x = 0;x < 3;x++){
			for(int y = 0;y<3;y++){
				System.out.print(arr[x][y] + " ");
			}
			System.out.println();
		}
	}
}