package shu;

import java.io.Console;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class DoubleDemo {
	public static void main(String[] args) throws IOException {
		System.out.println(2-1.1);
		System.out.println("\u0023 + \u0023");
		
		//int n = 123456789;
		//float nb = n;
		//System.out.println(nb);
		String greeting = "Hello";
		int n = greeting.length();
		int cpCout =greeting.codePointCount(0, greeting.length());
		System.out.println(n +" " + cpCout);
		
		Scanner in = new Scanner(System.in);
//		String str = in.nextLine();
//		System.out.println(str);
//		String str1 = in.next();
//
//		for(int x=0;x > 2 ;x++){
//			System.out.println(str1);
//		}
//		
//		Console cons = System.console();
//		//String username = cons.readLine("User name: ");
//		char[] passwd = cons.readPassword("Password: ");
		
		System.out.printf("%,f",10000.0*300.0);
		Scanner file = new Scanner(Paths.get("myfile.txt"),"UTF-8");
	}
}
