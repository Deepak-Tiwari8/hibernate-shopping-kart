package com.ty.shoppingKart.controller;

import com.ty.shoppingKart.services.ProductServices;

public class GetProductByBrand {

	public static void main(String[] args) {
		ProductServices services = new ProductServices();
		 services.getProductByBrand("Oppo");
		
	}
}
