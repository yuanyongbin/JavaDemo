package cn.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
	public static void main(String[] args) {
		Collection coll = new ArrayList();
		coll.add("Hello");
		coll.add("world");
		coll.add("java");
		// ������ܣ�ɾ�������е�����Ԫ�أ�
		// coll.clear();
		
		//ɾ��ĳ��Ԫ��
		//System.out.println("remove : " + coll.remove("Hello"));
		
		//�жϹ��ܣ��жϼ������Ƿ����ָ��Ԫ��
		//System.out.println("contains : " + coll.contains("Hello"));
		
		//�ж��Ƿ�Ϊ�գ�
		//System.out.println("isEmpty : " + coll.isEmpty());
		
		//���ȹ��ܣ�
		System.out.println("size : " + coll.size());
		System.out.println(coll);

	}
}
