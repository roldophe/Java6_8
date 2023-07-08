package com.Radom.java.OnlineCourse.OPP.Products;

public class ProductApplication {

	public static void main(String[] args) {
		Product pro[] = new Product[5];
		pro[0]= new Product(101, "Coca", 2.5, 3);
		pro[1]= new Product(102, "Wurk", 1.5, 3);
		pro[2]= new Product(103, "Vigor", 0.5, 2);
		pro[3]= new Product(104, "Passion", 3.5, 1);
		//pro.detial();
//		
//		for(int i=0; i<5; i++) {
//			System.out.println(pro[i].toString());
//		}
//		
		ProductServive productServive = new ProductServive();
		int number=2;
		Product[] product = productServive.createProductArray(number);
		productServive.print(product);
		
		

	}

}
