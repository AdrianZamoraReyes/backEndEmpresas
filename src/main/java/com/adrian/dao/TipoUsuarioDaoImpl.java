package com.adrian.dao;

import org.hibernate.SessionFactory;

public class TipoUsuarioDaoImpl {
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
