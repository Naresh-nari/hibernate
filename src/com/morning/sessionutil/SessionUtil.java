package com.morning.sessionutil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionUtil {

	public static Session getSession() {
		SessionFactory sessionFactory = new Configuration().configure("com/morning/config/hibernate.cfg.xml")
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		return session;
	}

	public static void closeSession(Session session) {
		session.close();
	}
	public static void main(String[] args) {
		System.out.println(SessionUtil.getSession());
	}
	
}
