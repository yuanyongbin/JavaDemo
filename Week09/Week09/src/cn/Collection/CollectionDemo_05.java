package cn.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo_05 {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		
		Student s1 = new Student("����ϼ",27);
		Student s2 = new Student("С��Ů",26);
		Student s3 = new Student("����",29);
		
		c1.add(s1);
		c1.add(s2);
		c1.add(s3);
		
		Object[] ob = c1.toArray();
		
		for(int x = 0;x < ob.length;x++){
			//System.out.println(ob[x]);
			Student s = (Student)ob[x];
			System.out.println(s.getName() + " --- " + s.getAge());
			
		}
	}
}
