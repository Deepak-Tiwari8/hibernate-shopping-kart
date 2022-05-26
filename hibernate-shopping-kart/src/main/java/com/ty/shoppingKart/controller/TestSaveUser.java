package com.ty.shoppingKart.controller;

import com.ty.shoppingKart.dto.User;
import com.ty.shoppingKart.services.UserServices;

public class TestSaveUser {

	public static void main(String[] args) {
		UserServices  services = new UserServices();
		User user = new User();
		user.setName("raj");
		user.setEmail("raj@663gmail.com");
		user.setPassword("raj865");
		user.setPhone(7797760l);
     	services.saveUser(user);
 
	}

}
