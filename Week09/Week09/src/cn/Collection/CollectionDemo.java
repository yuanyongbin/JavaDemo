package cn.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
	public static void main(String[] args) {
		Collection coll = new ArrayList();
		coll.add("Hello");
		coll.add("world");
		coll.add("java");
		// 清除功能：删除对象中的所有元素：
		// coll.clear();
		
		//删除某个元素
		//System.out.println("remove : " + coll.remove("Hello"));
		
		//判断功能：判断集合中是否包含指定元素
		//System.out.println("contains : " + coll.contains("Hello"));
		
		//判断是否为空：
		//System.out.println("isEmpty : " + coll.isEmpty());
		
		//长度功能；
		System.out.println("size : " + coll.size());
		System.out.println(coll);

	}
}
