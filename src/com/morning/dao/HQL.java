package com.morning.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.morning.entity.Product;
import com.morning.sessionutil.SessionUtil;

public class HQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = SessionUtil.getSession();
		session.getTransaction().begin();
		
		String hqlQuery="select id,Name,price from Product";
		System.out.println(hqlQuery);
		Query<Product> query=session.createQuery(hqlQuery);
		List list=query.list();
		for(Object produ:list) {
			System.out.println(produ);
		}
		
		query.executeUpdate();
		
		
	}

}
