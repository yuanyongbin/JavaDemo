package cn.itcst;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		int[] n = {1,2,3,4,5,6,7,8};
		n++;
		System.out.println(n);
		for(int element:n)
			System.out.println(element);
	}
}
