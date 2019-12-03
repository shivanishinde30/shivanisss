package com.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.training.beans.Book;
import com.training.service.BookService;

@Controller
public class BookController {
	@Autowired
	BookService bookService;
	
	@RequestMapping(value="/")
	public String bk() {
		
		return "index";
	}
	
	@RequestMapping(value="/getBooks")
	public ModelAndView getBooks() {
		List<Book> blist=bookService.getBooks();
		return new ModelAndView("getAllBooks","blist",blist);		
	}
	@RequestMapping("/addBook")
	public ModelAndView add(){
		return new ModelAndView("addBook");
		
		
	}

	
	@RequestMapping("/insertBooks")
	public ModelAndView addBook(@RequestParam("bid") int bid,@RequestParam("bname") String bname,@RequestParam("price") int price,@RequestParam("qty") int qty)
	{
		Book b=new Book(bid,bname,price,qty);
		bookService.addBook(b);
		return new ModelAndView("redirect:/getBooks");
		
	}

	
	  @RequestMapping("/edit/{bid}") 
	  public ModelAndView showEditForm(@PathVariable("bid") int bid) {
		 Book b=bookService.getById(bid);
	  return new ModelAndView("editform","b",b); }
	  
	  @RequestMapping("/edit/updateBook") 
	  public ModelAndView updateBook(@RequestParam("bid") int bid,@RequestParam("bname") String bname,@RequestParam("price") int price,@RequestParam("qty") int qty) { 
		  Book b=new Book(bid,bname,price,qty); bookService.updateBook(b); return new
	  ModelAndView("redirect:/getBooks"); }
	 
	@RequestMapping("/delete/{bid}")
	public ModelAndView deleteBook(@PathVariable("bid") int bid)
	{
		int a=bookService.deleteBookById(bid);
		if(a>0) {
			System.out.println("Deleted");
			
		}
		return new ModelAndView("redirect:/getBooks");
	}

}
