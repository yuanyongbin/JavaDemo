class DataTypeDemo2{
	public static void main(String[] args){
		byte a = 3;
		byte b = 3;
		
		byte d = (byte)128 ;		//两个byte相加为什么要类型提升int？？？
		System.out.println(d);
		long e = 21474836471;
	}
}