package com.ty.shoppingKart.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.query.criteria.internal.predicate.IsEmptyPredicate;

import com.ty.shoppingKart.dto.Product;
import com.ty.shoppingKart.dto.User;

public class ProductDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("deepak");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	Product product = new Product();

	public Product saveProduct(Product product) {
		entityTransaction.begin();
		entityManager.merge(product);
		entityTransaction.commit();
		return product;

	}

	public Product getProductByName(String name) {
		entityTransaction.begin();
		return entityManager.find(Product.class, name);

	}

	public Product getProductByBrand(String brand) {
		Product product = entityManager.find(Product.class, brand);
		if (product != null) {
			System.out.println(product);
//			System.out.println(product.getBrand());
//			System.out.println(product.getDescription());
//			System.out.println(product.getRating());
//			System.out.println(product.getSize());
//			System.out.println(product.getType());

			System.out.println("--------------------");
		} else {
			System.out.println("no data");
		}
		return product;

	}

	public Product getProductByType(String type) {
		entityTransaction.begin();
		return entityManager.find(Product.class, type);
	}

	public Product getProductById(int id) {
		entityTransaction.begin();
		entityManager.find(Product.class, id);
		if (id > 0) {
			System.out.println(product);
		} else {
			System.out.println("Id is not available");
		}
		return null;
	}

	public Product getProductBySize(int size) {
		entityTransaction.begin();
		entityManager.find(Product.class, product.getSize());
		if (product != null) {
			System.out.println(product);
		} else {
			System.out.println("Size is not available");
		}
		return null;
	}

	public Product getProductByRating(double rating) {
		entityTransaction.begin();
		return entityManager.find(Product.class, product.getRating());
	}

	public Product getProductByPrice(double price) {
		entityManager.find(Product.class, product.getPrice());

		if (product != null) {
			System.out.println(product);
		} else {
			System.out.println("Price is not available");
		}
		return null;
	}

	public boolean deleteProductById(int id) {
		return false;
	}

	public List<Product> getAllProduct() {
		String sql = "SELECT p FROM  Product p ";
		Query query = entityManager.createQuery(sql);
		List<Product> list = query.getResultList();
		return list;
	}

}
