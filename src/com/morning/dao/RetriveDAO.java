package com.morning.dao;

import org.hibernate.Session;

import com.morning.entity.Product;
import com.morning.entity.ProductDetails;
import com.morning.sessionutil.SessionUtil;

public class RetriveDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session =SessionUtil.getSession();
		session.getTransaction().begin();
		
		Product product =session.get(Product.class, 1);
		ProductDetails productDetails =product.getProductDetails();
		System.out.println("Product details are ............");
		System.out.println("product pdid :"+productDetails.getPdid());
		System.out.println("product quality :"+productDetails.getQuality());
		System.out.println("product quantity : "+productDetails.getQuantity());
		
		System.out.println("\nProduct details of "+productDetails.getPdid());
		
		System.out.println("product id :"+product.getId());
		System.out.println("product name : "+product.getName());
		System.out.println("product price : "+product.getPrice());
		
		session.getTransaction().commit();
		SessionUtil.closeSession(session);
		}
	public  static void sop(Object object) {
		System.out.println(object);
		
	}
	

	
	

}

