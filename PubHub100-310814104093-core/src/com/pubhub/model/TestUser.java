package com.pubhub.model;
 
public class TestUser {
	public static void main(String[] args) {
		User user = new User();
		user.setId(1);
		user.setName("saranya");
		user.setEmail_id("saran@gmail.com");
		user.setPassword("123");
		user.setActive(0);
		System.out.println(user);
}
}