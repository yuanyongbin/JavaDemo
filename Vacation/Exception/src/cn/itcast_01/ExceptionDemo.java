package cn.itcast_01;

import java.util.MissingFormatArgumentException;

/**
 *  异常
 * @author gzz
 * 程序的异常：Throwable
 * 		严重问题：error  我们不处理这种问题一般都很严重
 * 		问题：Exception
 * 			编译期问题：不是RuntimeException的异常   我们必须处理的问题，因为你不处理编译就不能通过
 * 			运行期问题：RuntimeException 我们也不处理，因为是你的问题，而且这个问题出现肯定是我们的代码不够严谨，需要修正代码
 *  如果程序出现了问题我们没有做任何处理，最终jvm 会做出默认处理
 *  把异常的名称，原因及出现的问题显示在控制台
 *  同时会结束程序
 */		

public class ExceptionDemo {
	public static void main(String[] args) {
		int a = 1;
		//int b = 2;
		int b = 0;
		System.out.println(a/b);
		System.out.println("over !!!");
	}
}
