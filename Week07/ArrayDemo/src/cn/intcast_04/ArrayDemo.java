package cn.intcast_04;
	//二分查找法的实现
public class ArrayDemo {
	public static void main(String[] args){
		//定义数组
		int[] arr = {5,3,33,22,1};
		ArraySort(arr);
		System.out.println("排序后");
		printArray(arr);
		
		//使用方法
		System.out.println(22 + "的位置是 ：" + halfArray(arr, 222));		
	}
	
	/*
	 * 返回值类型：int
	 * 参数列表：int[] arr,int value
	 * 
	 * */
	public static int halfArray(int[] arr,int value){
		//定义最大索引和最小索引
		int max = arr.length-1;
		int min = 0;
		
		//定义中间索引：
		int mid = (max + min)/2;
		
		//拿中间索引的值和你要的值进行比较
		while(arr[mid] != value){
			if(arr[mid] > value){
				max = mid - 1;
			}else{
				min = mid + 1;
			}
			if(max < min){
				return -1;
			}
			mid = (max + min)/2;
		}
		return mid;
	}
	
	//排序方法
	public static void ArraySort(int[] arr){
		for(int x = 0;x < arr.length;x++){
			for(int y = x;y < arr.length - 1; y++){
				if(arr[x] > arr[y + 1]){
					int temp;
					temp = arr[x];
					arr[x] = arr[y+1];
					arr[y+1] = temp;					
				}			
			}
		}
	}
	//bian lei  fanfa 
	public static void printArray(int[] arr){
		System.out.print("[ ");
		for(int x = 0;x < arr.length;x++){
			System.out.print(arr[x] + ", ");
		}
		System.out.println("]");
	}
}
