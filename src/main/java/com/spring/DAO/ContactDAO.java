package com.spring.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.omg.CORBA.TRANSACTION_MODE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.entity.Contact;
import com.spring.entity.ProductStatistic;
import com.spring.entity.User;

@Repository(value = "contactDAO")
public class ContactDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public void saveContact(Contact contact) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(contact);
		
		transaction.commit();
		session.close();
	}
	
	public List<Contact> getListContacts(String status){
		List<Contact> listContact = new ArrayList<Contact>();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Query query;
		if (status.equals("all")) {
			query = session.createQuery("FROM Contact");
		} else if (status.equals("contacted")) {
			query = session.createQuery("FROM Contact c WHERE c.status =:status");
			query.setParameter("status", true);
		} else {
			query = session.createQuery("FROM Contact c WHERE c.status =:status");
			query.setParameter("status", false);
		}
		
		listContact = query.list();
		
		transaction.commit();
		session.close();
		
		return listContact;
	}
	
	public Contact getContactDetail(int contactID) {
		Contact contact = new Contact();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		contact = session.get(Contact.class, contactID);
		
		transaction.commit();
		session.close();
		
		return contact;
	}
	
	public List<ProductStatistic> statisticByType(String type){
		List<ProductStatistic> listProduct = new ArrayList<ProductStatistic>();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createQuery("SELECT MONTH(c.startDate), SUM(c.numberProduct*c.product.price)  FROM Contact c WHERE c.status =:status AND c.product.type =:type "
				+ "GROUP BY MONTH(c.startDate)");
		query.setParameter("status", true);
		query.setParameter("type", type);
		List<Object[]> objects = query.list();
		
		for(Object[] object : objects) {
			int month =  (int) object[0];
			Long totalSell = (Long) object[1];
			ProductStatistic productStatistic = new ProductStatistic(month, type, "null", totalSell);
			listProduct.add(productStatistic);
		}
		transaction.commit();
		session.close();
		return listProduct;
	}
	
	public List<Contact> getListUserContacts(String status, User user){
		List<Contact> listContact = new ArrayList<Contact>();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Query query;
		if (status.equals("all")) {
			query = session.createQuery("FROM Contact c WHERE c.user =:user");
		} else if (status.equals("contacted")) {
			query = session.createQuery("FROM Contact c WHERE c.status =:status AND c.user =:user");
			query.setParameter("status", true);
		} else {
			query = session.createQuery("FROM Contact c WHERE c.status =:status AND c.user =:user");
			query.setParameter("status", false);
		}
		query.setParameter("user", user);
		listContact = query.list();
		
		transaction.commit();
		session.close();
		
		return listContact;
	}
}
