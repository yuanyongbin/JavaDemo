package cn.system;

//终止Java虚拟机

public class exitDemo {
	public static void main(String[] args) {
//		System.out.println("我们喜欢林青霞");
//		System.exit(0);
//		System.out.println("我不喜欢东方不败");
		
		long srart = System.currentTimeMillis();
		for(int x = 0;x<100000;x++){
			System.out.println("hello " + x);
		}
		long end = System.currentTimeMillis();
		System.out.println("共消耗：" + (end - srart) + "毫秒");
	}
}
