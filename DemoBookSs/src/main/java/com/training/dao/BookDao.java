package com.training.dao;

import java.util.List;

import com.training.beans.Book;

public interface BookDao {

	void addBook(Book b);

	List<Book> getAllBook();

	

	Book getBookById(int bid);

	int updateBook(Book b);

}
