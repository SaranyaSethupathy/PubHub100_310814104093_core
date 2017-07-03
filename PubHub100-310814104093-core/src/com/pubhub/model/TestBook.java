package com.pubhub.model;



public class TestBook {
	public static void main(String[] args) {
		Book book = new Book();
		book.setId(1);
		book.setName("java");
		book.setPrice(1000);
		System.out.println(book);
}
}