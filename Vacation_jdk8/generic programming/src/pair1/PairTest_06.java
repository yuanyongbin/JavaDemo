package pair1;

public class PairTest_06 {
	public static void main(String[] args) {
		String sb = "abc";
		
		Pair<String> pair = Pair.makePair(String.class);
		
		System.out.println(String.class);
		System.out.println(sb.getClass());
	}
	
}
