package com.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.beans.Book;
import com.training.dao.BookDao;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookDao bookDao;
	public List<Book> getBooks() {
		
		return bookDao.getBooks();
	}
	@Override
	public int addBook(Book b) {
		 return bookDao.addBook(b);
	}
	@Override
	public Book getById(int bid) {
		return bookDao.getById(bid);
	}
	@Override
	public int updateBook(Book b) {
		return bookDao.updateBook(b);		
	}
	@Override
	public int deleteBookById(int bid) {
		return bookDao.deleteBook(bid);
	}

}
