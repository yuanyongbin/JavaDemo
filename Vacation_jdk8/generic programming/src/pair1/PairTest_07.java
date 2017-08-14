package pair1;

import java.util.ArrayList;
import java.util.Collection;

/*
 * varargs ����
 */
public class PairTest_07 {
	public static void main(String[] args) {
		Collection<Pair<String>> table = new ArrayList<Pair<String>>();
		Pair pair1 = new Pair();
		Pair pair2 = new Pair();
		addAll(table,pair1,pair2);
	}
	@SafeVarargs
	public static <T> void addAll (Collection<T> coll,T...ts ){
		for(T t:ts) coll.add(t);
	}
}


