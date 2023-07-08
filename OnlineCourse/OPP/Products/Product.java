package com.Radom.java.OnlineCourse.OPP.Products;

public class Product {

	private	int code;
	private String name;
	private double price;
	private int qty;
	
	public Product() {
		this.code=0;
		this.name=null;
		this.price=0.0;
		this.qty=0;
	}
	public Product(int code, String name , double price ,int qty) {
		this.code=code;
		this.name=name;
		this.price=price;
		this.qty=qty;
	}
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getTotalPrice() {
		return getPrice()*getQty();
	}
/*
	public String displayDetial() {
		return ("Code: %s, Name: %s, Price: %s Quantiy: %d Total: %.2f".formatted(code,name,price,qty,getTotalPrice()));
	}
*/
	@Override
	public String toString() {
		return "Product [code=" + code + ", name=" + name + ", price=" + price + "$, quantity=" + qty +", TotalPrice "+ getTotalPrice()+ "$ ]";
	}
	
}
