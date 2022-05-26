package com.ty.shoppingKart.controller;

import java.util.Scanner;

import com.ty.shoppingKart.dto.Product;
import com.ty.shoppingKart.services.ProductServices;

public class TestGetById {

	public static void main(String[] args) {
		ProductServices services = new ProductServices();

		Scanner in = new Scanner(System.in);
		System.out.println("Enter your id");
		int id = in.nextInt();
		Product p = services.getProductById(id);
		if (p != null) {
			System.out.println(p);
		} else {
			System.out.println("No such id exits given by");
		}
	}
}
