package pair1;

import java.time.LocalDate;

public class DataIterval extends Pair<LocalDate> {
	private LocalDate first;
	private LocalDate second;
	public void setSecond (LocalDate second){
		this.second = second;
	}
	
	public void setFirst (LocalDate first){
		this.first = first;
	}
	public LocalDate getSecond(){
		return this.second;
	}
	public LocalDate getFirst(){
		return this.first;
	}
}
