package uitl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DBHelpar {
	private static final String driver = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3307/user";
	private static final String USERNAME ="root";
	private static final String password = "0000";
	
	private static Connection conn = null;
	
	//��̬���븺���������
	static {
		try {
			Class.forName(driver);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	//����ģʽ�������ݿ����Ӷ���
	public static Connection getConnetion() throws SQLException{
		if(conn == null){
			conn = DriverManager.getConnection(URL, USERNAME, password);
			return conn;
		}
		return conn;
	}



	public static void main(String[] args){
		try
		{
		   Connection conn = DBHelpar.getConnetion();
		   if(conn!=null)
		   {
			   System.out.println("���ݿ�����������");
		   }
		   else
		   {
			   System.out.println("���ݿ������쳣��");
		   }
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
}
		

