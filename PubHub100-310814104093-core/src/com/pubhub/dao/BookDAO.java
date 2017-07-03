package com.pubhub.dao;


	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.util.ArrayList;
	import java.util.List;

import com.pubhub.model.Book;
import com.pubhub.util.ConnectionUtil;

public class BookDAO {
	
		public void save(Book book) throws Exception {

			Connection connection = ConnectionUtil.getConnection();

			PreparedStatement pst = connection.prepareStatement("insert into books(name,price) values(?,?)");

			pst.setString(1, book.getName());
			pst.setInt(2, book.getPrice());

			pst.executeUpdate();
		}

		public void update(Book book) throws Exception {

			Connection connection = ConnectionUtil.getConnection();

			PreparedStatement pst = connection.prepareStatement("update books set name=? where id=?");

			pst.setString(1, book.getName());
			pst.setInt(2, book.getId());

			pst.executeUpdate();
		}

		public void delete(int id) throws Exception {

			Connection connection = ConnectionUtil.getConnection();

			PreparedStatement pst = connection.prepareStatement("delete from books where id=?");

			pst.setInt(1, id);

			pst.executeUpdate();
		}
		public List<Book> findAll() throws Exception {

			Connection connection = ConnectionUtil.getConnection();

			PreparedStatement pst = connection.prepareStatement("select id,name,price from books");

			ResultSet rs=pst.executeQuery();
			List<Book> books=new ArrayList<>();
			while (rs.next())
			{
				Book book = new Book();
				book.setId(rs.getInt(1));
				book.setName(rs.getString(2));
				book.setPrice(rs.getInt(3));
				books.add(book);
			}return books;
		}
		
		public  Book findById(int id) throws Exception {

			Connection connection = ConnectionUtil.getConnection();

			PreparedStatement pst = connection.prepareStatement("select id,name,price from books where id=?");
			pst.setInt(1,id);
	        ResultSet rs=pst.executeQuery();
			Book book = new Book();
			if (rs.next())
			{
				
				book.setId(rs.getInt(1));
				book.setName(rs.getString(2));
				book.setPrice(rs.getInt(3));
				
			}return book;
			
		}
		public List<Book>findByName(String name) throws Exception {

				Connection connection = ConnectionUtil.getConnection();

				PreparedStatement pst = connection.prepareStatement("select id,name,price from books where name=?");
				
				pst.setString(1,name);

				ResultSet rs=pst.executeQuery();
			
				List<Book> books=new ArrayList<>();
				while (rs.next())
				{
					Book book = new Book();
					book.setId(rs.getInt(1));
					book.setName(rs.getString(2));
					book.setPrice(rs.getInt(3));
					books.add(book);
				}return books;
				
		}
		

	}



