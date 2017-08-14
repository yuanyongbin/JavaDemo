package pair1;

import java.time.LocalDate;

public class PairTest_05 {
	public static void main(String[] args) {
		DataIterval_01 interval = new DataIterval_01();
        Pair<LocalDate> pair = interval;
        pair.setFirst(LocalDate.now());
        System.out.println(pair.getFirst());
        pair.setSecond(LocalDate.now());
        System.out.println(pair.getSecond());
    }

}
