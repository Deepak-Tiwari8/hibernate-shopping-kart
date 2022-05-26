package com.ty.shoppingKart.controller;

import com.ty.shoppingKart.services.ProductServices;

public class GetProductBySize {

	public static void main(String[] args) {
		ProductServices services = new ProductServices();
		 services.getProductBySize(163);
	}

}
