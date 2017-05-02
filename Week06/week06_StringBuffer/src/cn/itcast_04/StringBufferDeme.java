package cn.itcast_04;
//public StringBuffer replace(int start,int end,String str);  //Ìæ»»¹¦ÄÜ
public class StringBufferDeme {
	public static void main(String[] args){
		StringBuffer sb = new StringBuffer();
		
		sb.append("hello world;");
		sb.replace(0, 6, "yuanyongbin");
		System.out.println("sb :" + sb);
	}
}
