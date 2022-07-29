package com.morning.dao;

import org.hibernate.Session;

import com.morning.entity.Product;
import com.morning.sessionutil.SessionUtil;

public class DeleteDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = SessionUtil.getSession();
		session.getTransaction().begin();

		Product product1 = (Product) session.get(Product.class, 3);
		session.delete(product1);

		Product Product2 = (Product) session.get(Product.class, 2);
		session.delete(Product2);

		Product Product3 = (Product) session.get(Product.class, 1);
		session.delete(Product3);

		session.getTransaction().commit();
		SessionUtil.closeSession(session);
	}
}
