package com.ty.shoppingKart.controller;

import com.ty.shoppingKart.dto.User;
import com.ty.shoppingKart.services.UserServices;

public class TestValidateUser {

	public static void main(String[] args) {
		
		UserServices services=new UserServices();
		
		User user=services.validateUser("raj@663gmail.com", "raj865");
		
		if(user != null)
		{
			System.out.println(user);
		}
		else
		{
			System.out.println("wrong email and password");
		}
	
	}
}
