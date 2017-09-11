package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import uitl.DBHelpar;
import entity.User;

public class ItemsDao {
	//��ȡ���е��û���Ϣ
		public ArrayList<User> getAllUsers(){
			Connection conn = null;
			PreparedStatement stmt = null;
			ResultSet rs = null;
			
			ArrayList<User> list = new ArrayList<User>();//���ڴ洢�û���Ϣ
			try {
				conn = DBHelpar.getConnetion();
				String sql = "select * from users;";  //�鿴�û���Ϣ��SQL���
				stmt = conn.prepareStatement(sql);   //����һ�� PreparedStatement ���������������� SQL ��䷢�͵����ݿ⡣
				rs = stmt.executeQuery();
				while (rs.next()) {
					User user = new User();
					user.setUsername(rs.getString("username"));
					user.setPassword(rs.getString("password"));
					list.add(user);
				}
				return list;
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				return null;
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
		
	//�ж��û���¼�Ƿ��ܳɹ�	
	public boolean boolLogin(String username,String password){
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DBHelpar.getConnetion();
			String sql = "select * from users;";  //�鿴�û���Ϣ��SQL���
			stmt = conn.prepareStatement(sql);   //����һ�� PreparedStatement ���������������� SQL ��䷢�͵����ݿ⡣
			rs = stmt.executeQuery();
			while(rs.next()){
				User user = new User();
				user.setUsername(rs.getString("username"));
				//System.out.println(username);
				//System.out.println(user.getUsername());
				user.setPassword(rs.getString("password"));
				//System.out.println(password);
				//System.out.println(user.getPassword());
				if(user.getUsername().equals(username)){
					if(user.getPassword().equals(password))
						return true;
				}		
			}
			return false;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
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
	
	//�ж��û��Ƿ�ע��
	public boolean boolLogup(String username){
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBHelpar.getConnetion();
			String sql = "select username from users ;";
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while(rs.next()){
				User user = new User();
				user.setUsername(rs.getString("username"));	
				if(user.getUsername().equals(username))
					return true;
			}
			return false;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
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
