package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DBHelper {
	private static final String driver = "com.mysql.jdbc.Driver";
	//private static final String url = "jdbc:mysql://Localhsot:3307/jdbc?useUnicode=true&characterEncoding=UTF";
	private static final String url = "jdbc:mysql://localhost:3307/newsranking";
	private static final String username = "root";
	private static final String password = "0000";
	
	private static Connection conn = null;
	//��̬���븺���������
	static {
		try {
			Class.forName(driver);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	//����ģʽ�������ݿ����Ӷ���
	public static Connection getConnection () throws SQLException{
		if(conn == null){
			conn = DriverManager.getConnection(url, username, password);
			return conn;
		}
		return conn;
	}
	
	public static void main(String[] args)  {
		try {
			Connection conn  = DBHelper.getConnection();
			if(conn!= null){
				System.out.println("���ݿ���������");
			}else{
				System.out.println("���ݿ������쳣");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
