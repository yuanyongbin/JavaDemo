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
	
	//静态代码负责加载驱动
	static {
		try {
			Class.forName(driver);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	//单例模式返回数据库链接对象
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
			   System.out.println("数据库连接正常！");
		   }
		   else
		   {
			   System.out.println("数据库连接异常！");
		   }
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
}
		

