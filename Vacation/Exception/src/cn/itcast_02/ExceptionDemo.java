package cn.itcast_02;


/**
 * 
 * @author gzz
 * 我们自己如何处理异常：
 * 		A：rty...catch... finally
 * 		B:throws 抛出
 * 
 *  	rty...catch... finally的处理格式：
 *  		try{
 *  			可能出现问题的代码
 *  		}catch(异常名 变量){
 *  			针对问题的处理
 *  		}finally{
 *  			释放资源
 *  		}	
 *  注意：A：try 的代码越少越好
 *  	  B：catch 里边必须有内容，那怕是一个简单错误提示
 */

public class ExceptionDemo {
	public static void main(String[] args) {
		int a = 1;
		int b = 0;
		try{
			System.out.println(a/b);
		}catch(ArithmeticException ae){
			System.out.println("除数不能为0");
		}
		System.out.println("over !!!");
	}
}
