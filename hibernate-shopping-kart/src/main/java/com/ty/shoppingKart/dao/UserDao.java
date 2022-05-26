package com.ty.shoppingKart.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.shoppingKart.dto.User;

public class UserDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("deepak");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();


	public User saveUser(User user) {

		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		return user;

	}

	public User getById(int id) {
		entityTransaction.begin();
		return entityManager.find(User.class, id);
	}

	public List<User> getAllUser() {
		String sql = "SELECT u FROM  User u ";
		Query query = entityManager.createQuery(sql);
		List<User> list = query.getResultList();
		return list;

	}

	public User validateUser(String email, String password) {
		String sql = "SELECT u FROM  User u WHERE u.email =?1 AND  u.password = ?2";
		Query query = entityManager.createQuery(sql);

		query.setParameter(1,email);
		query.setParameter(2,password);

		List<User> list = query.getResultList();
		if(list.size()>0)
		{
			return list.get(0);
		}else
		return null;
	}
	
	public boolean deleteUserById(int id)
	{
		return false;
	}
}
