package pair1;


//����ʱ���Ͳ�ѯֻ������ԭʼ����

public class PairTEst_02 {
	public static  void main(String[] args) {
		Pair<String> a = new Pair();
		if(a instanceof Pair){
			System.out.println("a��Pair<Stirng>�Ķ���");
		}
		System.out.println(a.getClass());
	}
}
