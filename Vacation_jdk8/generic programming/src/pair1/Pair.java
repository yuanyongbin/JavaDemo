package pair1;

public class Pair<T> {
	private T first;
	private T second;
	
	public Pair(){
		first = null;
		second = null;
	}
	
	public Pair(T frist,T second){
		this.first = first;
		this.second = second;
	}
	
	public T getFirst(){
		return first;
	}
	
	public T getSecond(){
		return second;
	}
	
	public void setFirst(T first){
		this.first = first;
	}
	
	public void setSecond(T second){
		this.second = second;
	}
	
	public static <T> Pair<T> makePair(Class<T> cl){
		try{
			return new Pair<>(cl.newInstance(),cl.newInstance());
		}catch(Exception ex){
			return null;
		}
	}
	
	/*
	 * ���Ƴ�ͻ�����ͶԵķ������ڣ�t�������Ͷ�����ȣ����󣩵Ĳ�����ͬ������
	 * ��������
	 */
//	public boolean equals(T obj) {
//		// TODO Auto-generated method stub
//		return super.equals(obj);
//	}
}
