package com.ty.shoppingKart.services;

import com.ty.shoppingKart.dao.ProductDao;
import com.ty.shoppingKart.dto.Product;
import com.ty.shoppingKart.dto.User;

public class ProductServices {
	ProductDao dao = new ProductDao();

	public Product saveProduct(Product product) {
		return dao.saveProduct(product);
	}

	public Product getProductByName(String name) {
		return dao.getProductByName(name);
	}

	public Product getProductById(int id) {
		return dao.getProductById(id);
	}

	public Product getProductByBrand(String brand) {
		return dao.getProductByBrand(brand);
	}

	public Product getProductBySize(int size) {
		return dao.getProductBySize(size);
	}
	
	public Product getProductByType(String type) {
		return dao.getProductByType(type);
	}

	public Product getProductByPrice(double price) {
		return dao.getProductByPrice(price);
	
	}
	
	public boolean deleteProductById(int id) {
		return dao.deleteProductById(id);
	}

	
}
