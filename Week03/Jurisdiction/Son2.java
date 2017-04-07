
package cn.qx;
import com.liuyi.Father;     //Son2.java:3: 错误: Father在com.liuyi中不是公共的; 无法从外部程序包中对其进行访问
public class Son2 extends Father {
	public static void main(String[] args){
		Father f = new Father();
		//f.show();        // 错误: show()可以在Father中访问private
		//f.show2();       //错误: show2()在Father中不是公共的; 无法从外部程序包中对其进行访问
		//f.show3();       // 错误: show3()可以在Father中访问protected
		f.show4();
		System.out.println("----------------");
		
		Son2 s = new Son2();
		//s.show();     
		//s.show2();     
		s.show3();     
		s.show4();
	} 
}