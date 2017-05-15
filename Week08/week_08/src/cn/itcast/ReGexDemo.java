package cn.itcast;

import java.util.Scanner;


/*
 * 校验QQ号码
 *   必须是0 - 15 位数
 *   不能是0开头
 *   
 */
public class ReGexDemo {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的QQ号");
		String qq = sc.nextLine();
		System.out.println("checkQQ ; " + checkQQ(qq));
		
	}
	
	public static boolean checkQQ(String qq){
		boolean flag = true;
		
		//校验长度
		if(qq.length() >= 5 && qq.length() <= 15){
			//校验开头：
			if(!qq.startsWith("0")){
				char[] chs = qq.toCharArray();
				for(int x = 0;x < qq.length();x++){
					char ch = chs[x];
					if(!Character.isDigit(ch)){
						flag = false;
					}
					
				}
			}else{
				flag = false;
			}
		}else{
			flag = false;
		}
		return flag;
	}
}
