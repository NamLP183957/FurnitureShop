package com.spring.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.entity.User;

@Repository(value = "userDAO")
public class UserDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@SuppressWarnings("finally")
	public Boolean saveUser(User user) {
		Boolean status = true;
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.save(user);
			transaction.commit();
		} catch (Exception e) {
			System.out.println("Cannot save user");
			status = false;
		} finally {
			session.close();
			return status;
		}
		
		
	}
	public User getUser(String email, String password) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		List<User> listUser = new ArrayList<User>();
		
			Query query = session.createQuery("FROM User u WHERE u.email =:email AND u.password =:password");
			query.setParameter("email", email);
			query.setParameter("password", password);
			listUser = query.list();
			
			transaction.commit();
			session.close();
			if(listUser.size() > 0) {
				return listUser.get(0);
			}
			else {
				return null;
			}	
		
	}
}
