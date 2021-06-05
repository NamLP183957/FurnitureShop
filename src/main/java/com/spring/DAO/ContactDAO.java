package com.spring.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.omg.CORBA.TRANSACTION_MODE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.entity.Contact;

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
	
	public List<Contact> getListProduct(String status){
		List<Contact> listContact = null;
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Query query;
		if (status.equals("all")) {
			query = session.createQuery("FROM Contact");
		} else if (status.equals("not contact")) {
			query = session.createQuery("FORM Contact c WHERE c.state := state");
			query.setParameter("state", false);
		} else {
			query = session.createQuery("FROM Contact c WHERE c.state := state");
			query.setParameter("state", true);
		}
		
		listContact = query.list();
		
		transaction.commit();
		session.close();
		
		return listContact;
	}
}
