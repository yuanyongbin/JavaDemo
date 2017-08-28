package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import util.DBHelper;
import entity.List;

public class ListDAO {
	//ҵ���߼���
	
	
		public ArrayList<List> getAllList() {
			Connection conn = null;
			PreparedStatement stmt = null;
			ResultSet rs = null;
			ArrayList<List> list = new ArrayList<List>(); 
			try {
				conn = DBHelper.getConnection();
				String sql = "select * from list"; // SQL���
				stmt = conn.prepareStatement(sql);
				rs = stmt.executeQuery();
				while (rs.next()) {
					List listNew = new List();
					listNew.setId(rs.getString("id"));
					listNew.setTitle(rs.getString("title"));
					listNew.setMedia(rs.getString("media"));
					listNew.setNumber(rs.getInt("number"));
					listNew.setDate(rs.getTimestamp("date"));
					list.add(listNew);
					
				}
				return list; // ���ؼ��ϡ�
			} catch (Exception ex) {
				ex.printStackTrace();
				return null;
			} finally {
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
