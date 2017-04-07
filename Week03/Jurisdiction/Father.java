/*
	权限修饰符：       
						本类
		private			  y	  
		默认			  y
		protected    	  y
		public			  y
*/
package com.liuyi;

public class Father {
	private void show() {
		System.out.println("show private");
	}
	void show2(){
		System.out.println("show2 默认");
	}
	protected void show3() {
		System.out.println("show3 protected");
	}
	public void show4() {
		System.out.println("show4 public");
	}


public static void main(String[] atgs){
	Father f = new Father();
	f.show();
	f.show2();
	f.show3();
	f.show4();
	}

}