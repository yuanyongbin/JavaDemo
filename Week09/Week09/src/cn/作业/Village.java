package cn.��ҵ;


public class Village {
	private static int  wawaterAmount = 100;
	public void Use(int x){
		wawaterAmount -= x;
	}
	public void show(){
		System.out.println("��ˮһ����100��ʣ�£� " + wawaterAmount );
	}

	
}
