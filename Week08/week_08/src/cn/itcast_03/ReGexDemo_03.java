package cn.itcast_03;
//分割功能

public class ReGexDemo_03 {
	public static void main(String[] args) {
		//定义字符串：
		String str = "aa,bb,cc";		
		String regex = ",";
		String[] strs = str.split(regex);		
		for(int x = 0;x< strs.length;x++){
			System.out.println("strs : " + strs[x]);
		}
		
		System.out.println("------------------------------");
		
		String str1 = "aa.bb.cc";		
		String regex1 = "\\.";
		String[] strs1 = str1.split(regex1);		
		for(int x = 0;x< strs1.length;x++){
			System.out.println("strs1 : " + strs1[x]);
		}
		System.out.println("------------------------------");
		
		String str2 = "aa     bb               cc";		
		String regex2 = " +";
		String[] strs2 = str2.split(regex2);		
		for(int x = 0;x< strs2.length;x++){
			System.out.println("strs2 : " + strs2[x]);
		}
		
System.out.println("------------------------------");
		
		String str3 = "E:\\code\\JavaDemo\\Week08\\week_08";		
		String regex3 = "\\\\";
		String[] strs3 = str3.split(regex3);		
		for(int x = 0;x< strs3.length;x++){
			System.out.println("strs3 : " + strs3[x]);
		}
	}
	
}
