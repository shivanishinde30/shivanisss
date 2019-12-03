package com.training.beans;

public class Bike {
	private String oname,bname,disc,color,type;
	private int price;
	public Bike() {
		super();
	}
	public Bike(String oname, String bname, int price, String disc, String color,String type) {
		super();
		this.oname = oname;
		this.bname = bname;
		this.disc = disc;
		this.color = color;
		this.price = price;
		this.type = type;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOname() {
		return oname;
	}
	public void setOname(String oname) {
		this.oname = oname;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getDisc() {
		return disc;
	}
	public void setDisc(String disc) {
		this.disc = disc;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Bike [oname=" + oname + ", bname=" + bname + ", disc=" + disc + ", color=" + color + ", type=" + type
				+ ", price=" + price + "]";
	}

	

}
