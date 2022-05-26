package com.ty.shoppingKart.controller;

import com.ty.shoppingKart.dto.User;
import com.ty.shoppingKart.services.UserServices;

public class GetUserById {

	public static void main(String[] args) {
		UserServices  services = new UserServices();
		
		User  user =services.getById(1);
		
		if(user != null)
		{
			System.out.println(user);
		}
		else
			System.out.println("Nmnnnn");
		
		
	}

}
