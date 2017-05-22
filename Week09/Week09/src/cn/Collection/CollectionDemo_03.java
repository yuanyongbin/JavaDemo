package cn.Collection;

import java.util.ArrayList;
import java.util.Collection;

//  集合的遍历

public class CollectionDemo_03 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("hello");
		c.add("world");
		c.add("java");
		
		Object[] arr = c.toArray();
		for(int x = 0 ;x < arr.length ; x++){
			System.out.println(arr[x]);
		}
	}
}
