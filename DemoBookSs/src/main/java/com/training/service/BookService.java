package com.training.service;

import java.util.List;

import com.training.beans.Book;

public interface BookService {

	public int addBook(Book b);

	public List<Book> getAllBook();



	public Book getBookById(int bid);

	public int updateBook(Book b);

}
