package com.training.dao;

import java.util.List;

import com.training.beans.Book;

public interface BookDao {

	List<Book> getBooks();

	int addBook(Book b);

	Book getById(int bid);

	int updateBook(Book b);

	int deleteBook(int bid);

}
