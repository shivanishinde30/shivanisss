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
	BookService  bookService;
	/*
	 * @RequestMapping("/") public String startPage() { return "index"; }
	 */
	
	@RequestMapping("/getAllBook")
	public ModelAndView getAllBook()
	{
		System.out.println("hii");
		List<Book> blist=bookService.getAllBook();
		return new ModelAndView("getAllBook","blist",blist);
		
	}
	
	@RequestMapping("/addBook")
	public ModelAndView showAddForm() {
		
		return new ModelAndView("addBook","cmd",new Book());
	}
	
	@RequestMapping(value="/add")
	public ModelAndView addBook(@RequestParam("bid") int bid,@RequestParam("bname") String bname,@RequestParam("price") int price,@RequestParam("qty") int qty) 
	{
	Book b= new Book(bid,bname,price,qty);
	int a=bookService.addBook(b);
	
	return new ModelAndView("redirect:/getAllBook");
}	/*
	@RequestMapping(value="/edit{bid}")
	public ModelAndView showEditForm(@PathVariable("bid") int bid) {
		Book b=bookService.getBookById(bid);
		return new ModelAndView("editForm","b",b);
	}
	@RequestMapping("/updateBook")
	public ModelAndView updateBook(@RequestParam("bid") int id,@RequestParam("bname") String name,@RequestParam("price") int price,@RequestParam("qty") int qty)
	{
		Book b=new Book(id,name,price,qty);
		bookService.updateBook(b);
		return new ModelAndView("/getAllBook");
		
	}
	*/

}
