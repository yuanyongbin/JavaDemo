package staticlnnerClass;

//匿名内部类的使用

public class StaticlnnerClassTest {
	public static void main(String[] args) {
		double[] d = new double[20];
		for(int i = 0; i< d.length;i++){
			d[i] = 100 * Math.random();
		}
		ArrayAlg.Pair p = ArrayAlg.minmax(d);
		System.out.println("min = " + p.getFirst());
		System.out.println("max = " + p.getSecond());
	}
}


class ArrayAlg{
	public static class Pair{
		private double first;
		private double second;
		/**
		 * pair 的构造方法
		 * @param f the first number 
		 * @param s the second number 
		 * 
		 */
		public Pair(double f,double s){
			first = f;
			second = s;
		}
		
		/**
		 * 
		 * @return first
		 */
		public double getFirst(){
			return first;
		}
		/**
		 * 返回 second
		 * @return second
		 */
		public double getSecond(){
			return second;
		}
	}
	public static Pair minmax(double[] values){
		double min = Double.POSITIVE_INFINITY;
		double max = Double.NEGATIVE_INFINITY;
		for(double v : values){
			if(min > v ) min = v;
			if(max < v ) max = v;
		}
		return new Pair(min,max);
	}
}