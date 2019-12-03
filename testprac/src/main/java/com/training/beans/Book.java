package com.training.beans;

public class Book {
	private int bid,price,qty;
	private String bname;
		
	
	public Book() {
		super();
	}

	public Book(int bid, String bname, int price, int qty) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.price = price;
		this.qty = qty;
		
	}

	public int getBid() {
		return bid;
	}


	public void setBid(int bid) {
		this.bid = bid;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}


	public int getQty() {
		return qty;
	}


	public void setQty(int qty) {
		this.qty = qty;
	}


	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}


	@Override
	public String toString() {
		return "Book [bid=" + bid + ", price=" + price + ", qty=" + qty + ", bname=" + bname + "]";
	}

}
