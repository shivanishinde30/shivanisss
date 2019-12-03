package com.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.beans.Book;
import com.training.dao.BookDao;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	BookDao bookDao;
	
	public int addBook(Book b) {
		bookDao.addBook(b);
		return 0;
	}

	@Override
	public List<Book> getAllBook() {

		return bookDao.getAllBook();
		
	}



	@Override
	public Book getBookById(int bid) {
		return bookDao.getBookById(bid);
	}

	@Override
	public int updateBook(Book b) {
		return bookDao.updateBook(b);
	}

	

}
