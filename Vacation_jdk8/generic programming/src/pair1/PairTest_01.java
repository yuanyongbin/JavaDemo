package pair1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PairTest_01 {
	public static void main(String[] args) {
		DateTimeFormatter ymd = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate ld = LocalDate.parse("2015-11-23", ymd);
		DataIterval interval = new DataIterval();
		Pair<LocalDate> pair = interval;
		pair.setSecond(ld);
		System.out.println(pair.getSecond());
	}	
		
}

class ArrayAlg{
	
	public static Pair<String> minmax (String[] a){
		if (a == null || a.length == 0){
			return null;
		}
	    String min = a[0];
	    String max = a[0];
	    
	    for(int i = 1;i<a.length ;i++){
	    	if(min.compareTo(a[i]) > 0) min = a[i];
	    	if(max.compareTo(a[i]) < 0) max = a[i];
	    }
	    return new Pair<>(min,max);
	}
}


