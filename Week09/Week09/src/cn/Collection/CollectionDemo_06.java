package cn.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//迭代器，集合专用的遍历方式；


public class CollectionDemo_06 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		
		c.add("hello");
		c.add("world");
		c.add("java");
		
		Iterator it = c.iterator();
	}
}
