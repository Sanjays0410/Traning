package com.cruds.collections;

import java.util.HashSet;
import java.util.Set;

public class Proddemo {

	public static void main(String[] args) {
		
		Set<Product> prods=new HashSet<>();
		 prods.add(new Product(101, "Samsung 21 tv", 16000));
		 prods.add(new Product(201, "redmi", 16000));
		 prods.add(new Product(201,"redmi", 16000)); 
		 prods.add(new Product(301, "bicycle", 14000));
		 for(Product p:prods)
		 {
			 System.out.println(p);
		 }
	}

}
