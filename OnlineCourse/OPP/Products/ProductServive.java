package com.Radom.java.OnlineCourse.OPP.Products;

import java.util.Scanner;

public class ProductServive {
	
	public Product createProduct() {
		Scanner input = new Scanner(System.in);
			Product product = new Product();
			
			System.out.print("input code : ");
			product.setCode(input.nextInt());
			
			System.out.print("input name : ");
			product.setName(input.next());
			
			System.out.print("input price: ");
			product.setPrice(input.nextDouble());
			
			System.out.print("input qty  : ");
			product.setQty(input.nextInt());
			
			return product;
	}
	
	public Product[] createProductArray(int n) {
		Product[] products = new Product[n];
		for(int i=0; i<n; i++) {
			products[i]=createProduct();
		}
		return products;
	}
	public void print(Product[] products) {
		for(Product product:products) {
			System.out.println(product.toString());
		}
	}
}
