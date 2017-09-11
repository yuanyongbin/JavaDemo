package dao;

import java.util.ArrayList;
import java.util.Iterator;

import entity.User;

public class Test {
	public static void main(String[] args) {
		ArrayList<User> list = new ArrayList<User>();
		Updateuser updateuser = new Updateuser();
		
		//updateuser.updateusers("yuan1", "123456");
		
//		ItemsDao user = new ItemsDao();
//		
//		list = user.getAllUsers();
//      Iterator<User> it = list.iterator();
//      while(it.hasNext()){
//            User u = new User();
//            u = it.next();
//            System.out.println(u.getUsername());
//            System.out.println(u.getPassword());
//            
//      }
		
		//ItemsDao itemsa = new ItemsDao();
		//System.out.println(itemsa.boolLogin("yuan1", "password"));
		//System.out.println(itemsa.boolLogup("yuan1"));
//		String name = "abc";
//		String string  = "abc";
//		System.out.println(name.equals(string));
		updateuser.updateuserpassword("¡÷«‡œº", "297458");
	}
}
