package com.pubhub.dao;
 
import com.pubhub.model.User;

public class TestUserDAO {
	public static void main(String[] args) throws Exception {
	
	User user = new User();
	
	
	user.setName("snshdf");
	user.setEmail_id("smjg@gmail.com");
	user.setPassword("root");
	
	System.out.println(user);
	UserDAO dao=new UserDAO();
	dao.register(user);

}
}