package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Employee;

public class Test {
	
	public static void main(String[] args) {
		
		// Hibernate Framework Activated
		Configuration cfg = new Configuration();
		// read configuration file and store into in-memory metadata
		cfg = cfg.configure("hibernate.cfg.xml");
		// create SessionFactory Object
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		// creating Session Object
		Session session = sessionFactory.openSession();
		
		Employee emp = new Employee("jas", 19990.00);
		// performing persistence operation 
		session.save(emp);
		// creating Transaction object
		Transaction tx = session.beginTransaction();
		tx.commit();
	}

}
