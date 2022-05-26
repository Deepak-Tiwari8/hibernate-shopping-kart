package com.ty.shoppingKart.controller;


import com.ty.shoppingKart.dto.Product;
import com.ty.shoppingKart.services.ProductServices;

public class getProductByPrice {

	public static void main(String[] args) {
		ProductServices services = new ProductServices();
		Product p = services.getProductByPrice(3400);
		if(p!=null)
		{
			System.out.println(p);
		}
		
	}

}
