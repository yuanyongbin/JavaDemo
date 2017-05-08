package it.itcast_01;
//冒泡排序
public class ArrayDemo {
	public static void main(String[] args){
		//定义一个数组
		int[] arr = {24,69,88,44,13};
		System.out.println("排序前");
		printArray(arr);
		
//		//自己个版   ------选择排序
//		for(int i = 0;i<arr.length-1;i++){
//			for(int j = i+1;j <arr.length; j++){
//				int ar; 
//				if(arr[i] > arr[j]){
//					ar = arr[i];
//					arr[i] = arr[j];
//					arr[j] = ar;
//				}				
//			}
//		}
		//老师版
		for(int x = 0;x<arr.length;x++){
			for(int y = 0;y <arr.length -1-x;y++){
				if(arr[y] > arr[y+1]){
					int temp = arr[y];
					arr[y] = arr[y+1];
					arr[y+1] = temp;
				}
			}
		}
		System.out.println("排序后");
		printArray(arr);
	}
	
	//遍历功能：
	public static void printArray(int[] arr){
		System.out.print("[ ");
		for(int x = 0;x < arr.length;x++){
			System.out.print(arr[x] + ", ");
		}
		System.out.println("]");
	}
}
