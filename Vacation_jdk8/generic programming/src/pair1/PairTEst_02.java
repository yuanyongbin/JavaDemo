package pair1;


//运行时类型查询只适用于原始类型

public class PairTEst_02 {
	public static  void main(String[] args) {
		Pair<String> a = new Pair();
		if(a instanceof Pair){
			System.out.println("a是Pair<Stirng>的对象");
		}
		System.out.println(a.getClass());
	}
}
