package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import uitl.DBHelpar;
import entity.User;

public class ItemsDao {
	//获取所有的用户信息
		public ArrayList<User> getAllUsers(){
			Connection conn = null;
			PreparedStatement stmt = null;
			ResultSet rs = null;
			
			ArrayList<User> list = new ArrayList<User>();//用于存储用户信息
			try {
				conn = DBHelpar.getConnetion();
				String sql = "select * from users;";  //查看用户信息的SQL语句
				stmt = conn.prepareStatement(sql);   //创建一个 PreparedStatement 对象来将参数化的 SQL 语句发送到数据库。
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
			// 释放数据集对象
			if (rs != null) {
				try {
					rs.close();
					rs = null;
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
			// 释放语句对象
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
		
	//判断用户登录是否能成功	
	public boolean boolLogin(String username,String password){
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DBHelpar.getConnetion();
			String sql = "select * from users;";  //查看用户信息的SQL语句
			stmt = conn.prepareStatement(sql);   //创建一个 PreparedStatement 对象来将参数化的 SQL 语句发送到数据库。
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
			// 释放数据集对象
			if (rs != null) {
				try {
					rs.close();
					rs = null;
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
			// 释放语句对象
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
	
	//判断用户是否注册
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
			// 释放数据集对象
			if (rs != null) {
				try {
					rs.close();
					rs = null;
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
			// 释放语句对象
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
