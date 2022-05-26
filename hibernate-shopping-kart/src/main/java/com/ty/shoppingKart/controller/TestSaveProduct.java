package com.ty.shoppingKart.controller;


import com.ty.shoppingKart.dao.ProductDao;
import com.ty.shoppingKart.dto.Product;
import com.ty.shoppingKart.services.ProductServices;

public class TestSaveProduct {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.setName("oppo-F11");
		product.setBrand("Oppo");
		product.setPrice(3400);
		product.setSize(163);
		product.setType("smartPhone");
		product.setRating(5);
		product.setDescription("li-Po 3412 mAh battery");
		
	ProductDao p=new ProductDao();
	if(p!=null)
	{
		System.out.println(p);
	}
	else
	{
		System.out.println("Data no inserted");
	}
	}

}
