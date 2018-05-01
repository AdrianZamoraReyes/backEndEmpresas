package com.adrian.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.adrian.bean.Contratado;

@Repository
public class ContratadoDaoImpl implements ContratadoDao {
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Contratado> getContratados() {
		Session sesion = sessionFactory.getCurrentSession();
		return (List<Contratado>)sesion.createQuery("From Contratado").list();
	}

	@Override
	public void insertContratado(Contratado contratado) {
		Session sesion = sessionFactory.getCurrentSession();
		sesion.persist(contratado);
	}

	@Override
	public Contratado getContratadoById(int idContratado) {
		Session sesion = sessionFactory.getCurrentSession();
		return (Contratado)sesion.get(Contratado.class, idContratado);
	}

	@Override
	public void deleteContratado(int idContratado) {
		Session sesion = sessionFactory.getCurrentSession();
		sesion.delete(getContratadoById(idContratado));
	}

	@Override
	public void editContratado(Contratado contratado) {
		Session sesion = sessionFactory.getCurrentSession();
		sesion.update(contratado);
	}

}
