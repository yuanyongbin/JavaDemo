
package cn.qx;
import com.liuyi.Father;     //Son2.java:3: ����: Father��com.liuyi�в��ǹ�����; �޷����ⲿ������ж�����з���
public class Son2 extends Father {
	public static void main(String[] args){
		Father f = new Father();
		//f.show();        // ����: show()������Father�з���private
		//f.show2();       //����: show2()��Father�в��ǹ�����; �޷����ⲿ������ж�����з���
		//f.show3();       // ����: show3()������Father�з���protected
		f.show4();
		System.out.println("----------------");
		
		Son2 s = new Son2();
		//s.show();     
		//s.show2();     
		s.show3();     
		s.show4();
	} 
}