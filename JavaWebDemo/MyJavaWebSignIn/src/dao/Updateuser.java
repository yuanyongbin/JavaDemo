package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


import uitl.DBHelpar;


//�������ݿ�
public class Updateuser {
	
	public void updateusers(String username,String password){
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Statement sta = null;
		try {
			conn = DBHelpar.getConnetion();
			String sql = "insert INTO users(username,password) values ('" + username + "', '" + password  + " ' )";
			//stmt = conn.prepareStatement(sql);
			//rs = stmt.executeQuery();
			sta = conn.createStatement();
			sta.execute(sql);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			// �ͷ����ݼ�����
			if (rs != null) {
				try {
					rs.close();
					rs = null;
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
			// �ͷ�������
			if (stmt != null) {
				try {
					stmt.close();
					stmt = null;
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		}
	}



	public void updateuserpassword(String username,String password){
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Statement sta = null;
		try {
			conn = DBHelpar.getConnetion();
			String sql = "update users set password = '"+ password + "' where username = '"+username+"';";
			//stmt = conn.prepareStatement(sql);
			//rs = stmt.executeQuery();
			sta = conn.createStatement();
			sta.execute(sql);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			// �ͷ����ݼ�����
			if (rs != null) {
				try {
					rs.close();
					rs = null;
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
			// �ͷ�������
			if (stmt != null) {
				try {
					stmt.close();
					stmt = null;
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		}
	}
}
