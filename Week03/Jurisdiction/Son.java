

package com.liuyi;
class Son extends Father {
	public static void main(String[] args){
		Father f = new Father();
		//f.show();        //Son.java:7: ����: show()������Father�з���private
		f.show2();
		f.show3();
		f.show4();
		System.out.println("----------------");
		
		Son s = new Son();
		//f.show();      //Son.java:14: ����: show()������Father�з���private
		s.show2();
		s.show3();
		s.show4();
	} 
}