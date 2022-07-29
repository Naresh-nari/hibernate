package com.morning.dao;

import org.hibernate.Session;

import com.morning.entity.Product;
import com.morning.entity.ProductDetails;
import com.morning.sessionutil.SessionUtil;

public class UpdateDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = SessionUtil.getSession();
		session.getTransaction().begin();

		Product product = (Product) session.get(Product.class, 2);
		ProductDetails productDetails = product.getProductDetails();
		product.setName("papaya");
		productDetails.setQuantity(3);

		session.getTransaction().commit();
		SessionUtil.closeSession(session);
	}


		
	}


