package com.ty.shoppingKart.services;

import java.util.List;

import com.ty.shoppingKart.dao.UserDao;
import com.ty.shoppingKart.dto.User;
import com.ty.shoppingKart.util.AES;
import com.ty.shoppingKart.util.AppConstants;

public class UserServices {
    UserDao dao = new UserDao();
	public User saveUser(User user)
	{
		String encEmail = AES.encrypt(user.getEmail(), AppConstants.KEY);
		String encPassword = AES.encrypt(user.getPassword(), AppConstants.KEY);
		
		user.setEmail(encEmail);
		user.setPassword(encPassword);
	    return dao.saveUser(user);
	}
	
	public User getById(int id)
	{
		
		return dao.getById(id);
	}
	
	public List<User> getAllUser()
	{
		List<User> list = dao.getAllUser();
		for (User user : list) {
			String encEmail = AES.decrypt(user.getEmail(), AppConstants.KEY);
			String encPassword = AES.decrypt(user.getPassword(), AppConstants.KEY);
			user.setEmail(encEmail);
			user.setPassword(encPassword);
		}
		return list;
	}
	
	public boolean deleteUserById(int id)
	{
		return dao.deleteUserById(id);
	}
	public User validateUser(String email,String password)
	{
		User user = dao.validateUser(email, password);
		String encEmail = AES.decrypt(user.getEmail(), AppConstants.KEY);
		String encPassword = AES.decrypt(user.getPassword(), AppConstants.KEY);
		user.setEmail(encEmail);
		user.setPassword(encPassword);
		return user;
	}
}
