package cn.itcast_03;

//替换功能
/*
 * public String replaceAll(String regex,String replacement)
 * 		使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串
 */

public class ReGexDemo_05 {
	public static void main(String[] args) {
		String str = "hello125866434234657qq1234ka34da";

		String regex = "\\d+";
		String replacement = "";

		String ss = str.replaceAll(regex, replacement);

		System.out.println(ss);
	}
}
