package com.ty.shoppingKart.controller;

import java.util.List;

import com.ty.shoppingKart.dto.User;
import com.ty.shoppingKart.services.UserServices;
import com.ty.shoppingKart.util.AES;

public class TestGetAllUser {

	public static void main(String[] args) {
		
		UserServices services=new UserServices();
		
		List<User> list=services.getAllUser();
		
		if(list.size()>0)
		{
			for (User user : list) {
				
			
				System.out.println(user);
			}
			
		}
		else
		{
			System.out.println("No data");
		}
	}
}
