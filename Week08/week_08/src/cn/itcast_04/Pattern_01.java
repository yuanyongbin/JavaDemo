package cn.itcast_04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//获取功能：
//因此，典型的调用顺序是 
//
//Pattern p = Pattern.compile("a*b");
//Matcher m = p.matcher("aaaaab");
//boolean b = m.matches();
public class Pattern_01 {
	public static void main(String[] args) {
		String std = "tian la he tian shui de ai qing gu shi ,I love you";
		String regex = "\\b\\w{3}\\b";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(std);
//		boolean b = m.find();
//		System.out.println(b);
//		
//		String ss = m.group();
//		System.out.println(ss);
//		
//		b = m.find();
//		ss =m.group();
//		System.out.println(ss);
		
		while(m.find()){
			System.out.println(m.group());
		}
	}
}
