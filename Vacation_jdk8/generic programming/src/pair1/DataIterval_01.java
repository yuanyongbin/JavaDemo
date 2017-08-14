package pair1;

import java.time.LocalDate;

public class DataIterval_01 extends Pair<LocalDate>{
	public void setSecond(LocalDate second){
		if(second.compareTo(getFirst()) >= 0){
			super.setSecond(second);
		}
	}
}
