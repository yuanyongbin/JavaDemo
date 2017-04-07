package com.liuyi;
class Test{
	public static void main(String[] args){
		Father f = new Father();
		//f.show();        //Son.java:7: 错误: show()可以在Father中访问private
		f.show2();
		f.show3();
		f.show4();	
	}
}