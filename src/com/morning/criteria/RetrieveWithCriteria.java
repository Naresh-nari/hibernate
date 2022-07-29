package com.morning.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.morning.entity.Product;
import com.morning.sessionutil.SessionUtil;

public class RetrieveWithCriteria {

	public static void main(String[] args) {
		Session session = SessionUtil.getSession();
		session.getTransaction().begin();

		Criteria criteria = session.createCriteria(Product.class);

		Criterion idCriterion = Restrictions.gt("id", new Integer(2));
		Criterion nameCriterion =Restrictions.like("Name", new String("pomogranate"));
		Criterion orCriterion=Restrictions.and(idCriterion, nameCriterion);

		criteria.add(orCriterion);
		
		List list = criteria.list();
		for (Object product1 : list) {
			System.out.println(product1);
		}

	}

}
