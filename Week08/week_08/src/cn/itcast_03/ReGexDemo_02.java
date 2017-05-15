package cn.itcast_03;

import java.util.Scanner;

/*
 * 分割功能：
 * 		public String[] split(String regex)根据给定正则表达式的匹配拆分此字符串。
 */
public class ReGexDemo_02 {
	public static void main(String[] args) {
		//定义一个年龄搜索范围：
		String ages = "18-24";
		
		//定义规则：
		String reges = "-";
		//调用方法：
		String[] ageArray = ages.split(reges);
		
		for(int x = 0;x < ageArray.length;x++){
			System.out.println(ageArray[x]);
		}
		//字符串转换：
		int stratAge = Integer.parseInt(ageArray[0]);
		int endAge = Integer.parseInt(ageArray[1]);
		Scanner sc = new Scanner(System.in);
		boolean yes = false;
		do{
			
			System.out.println("请输入你想找的对象的年龄：");
			int age = sc.nextInt();
			if(age >= stratAge && age <= endAge){
				System.out.println("hello 找我干嘛");
			}else{
				System.out.println("什么玩意 gun");
			}
			while(true){
				Scanner sc1 = new Scanner(System.in);
				System.out.println("输入Y/N 继续查找(Y继续查找、N退出查找)");
				String Y = sc1.nextLine();
				char[] chs = Y.toCharArray();
				char ch1 = chs[0];
				if(ch1 == 'Y' || ch1 == 'y'){
					yes = true;
					break;
				}else if(ch1 == 'N'|| ch1 == 'n'){
					yes = false;
					break;
				}else{
					System.out.println("输入有误，重新输入：");
				}
			}
					
		}while(yes);
	System.out.println("欢迎下次光临");	
	}

}
