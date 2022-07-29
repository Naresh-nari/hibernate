package com.morning.dao;

import org.hibernate.Session;

import com.morning.entity.Product;
import com.morning.entity.ProductDetails;
import com.morning.sessionutil.SessionUtil;

public class CreateDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = SessionUtil.getSession();
		session.getTransaction().begin();
		
		ProductDetails productDetails = new ProductDetails();
		productDetails.setQuality("Awesome");
		productDetails.setQuantity(5);
		
		Product product1 =new Product();
		product1.setName("Apple");
		product1.setPrice(360);
		product1.setProductDetails(productDetails);
		
		Product product2 =new Product();
		product2.setName("Goa");
		product2.setPrice(306);
		product2.setProductDetails(productDetails);
		
		Product product3 =new Product();
		product3.setName("mango");
		product3.setPrice(120); 
		product3.setProductDetails(productDetails);
		
		Product product4 =new Product();
		product4.setName("pomogranate");
		product4.setPrice(150);
		product4.setProductDetails(productDetails);
		
		session.save(product1);
		session.save(product2);
		session.save(product3);
		session.save(product4);
		
		
		session.getTransaction().commit();
		SessionUtil.closeSession(session);

	}

}
