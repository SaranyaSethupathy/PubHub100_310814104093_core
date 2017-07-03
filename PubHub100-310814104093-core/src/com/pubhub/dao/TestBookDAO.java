package com.pubhub.dao;

import com.pubhub.model.Book;

public class TestBookDAO {
public static void main(String[] args) throws Exception {
        
		
		Book book = new Book();
		book.setId(13);
		book.setName("ja");
		book.setPrice(20);
		
		
		
		BookDAO dao = new BookDAO();
		   dao.save(book);
           dao.update(book);
		   dao.delete(book.getId());
		   System.out.println(dao.findAll());
		   System.out.println(dao.findById(book.getId()));
		     
	}
}
