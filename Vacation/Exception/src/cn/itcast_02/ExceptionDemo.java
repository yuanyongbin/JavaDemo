package cn.itcast_02;


/**
 * 
 * @author gzz
 * �����Լ���δ����쳣��
 * 		A��rty...catch... finally
 * 		B:throws �׳�
 * 
 *  	rty...catch... finally�Ĵ����ʽ��
 *  		try{
 *  			���ܳ�������Ĵ���
 *  		}catch(�쳣�� ����){
 *  			�������Ĵ���
 *  		}finally{
 *  			�ͷ���Դ
 *  		}	
 *  ע�⣺A��try �Ĵ���Խ��Խ��
 *  	  B��catch ��߱��������ݣ�������һ���򵥴�����ʾ
 */

public class ExceptionDemo {
	public static void main(String[] args) {
		int a = 1;
		int b = 0;
		try{
			System.out.println(a/b);
		}catch(ArithmeticException ae){
			System.out.println("��������Ϊ0");
		}
		System.out.println("over !!!");
	}
}
