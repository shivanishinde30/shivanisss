package com.training.service;

import java.util.List;

import com.training.beans.Book;


public interface BookService {

	List<Book> getBooks();

	int addBook(Book b);

	Book getById(int bid);

	int updateBook(Book b);

	int deleteBookById(int bid);

}
