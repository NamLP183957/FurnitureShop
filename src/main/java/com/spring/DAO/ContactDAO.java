package com.spring.DAO;

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
	
}
