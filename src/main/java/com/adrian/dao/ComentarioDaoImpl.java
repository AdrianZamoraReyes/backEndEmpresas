package com.adrian.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.adrian.bean.Comentario;

public class ComentarioDaoImpl implements ComentarioDao {
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Comentario> getComentarios() {
		Session sesion = sessionFactory.getCurrentSession();
		return (List<Comentario>)sesion.createQuery("From Comentario").list();
	}

	@Override
	public void insertComentario(Comentario comentario) {
		Session sesion = sessionFactory.getCurrentSession();
		sesion.persist(comentario);
	}

	@Override
	public Comentario getComentarioById(int idComentario) {
		Session sesion = sessionFactory.getCurrentSession();
		return (Comentario)sesion.get(Comentario.class, idComentario);
	}

	@Override
	public void deleteComentario(int idComentario) {
		Session sesion = sessionFactory.getCurrentSession();
		sesion.delete(getComentarioById(idComentario));
	}

	@Override
	public void editComentario(Comentario comentario) {
		Session sesion = sessionFactory.getCurrentSession();
		sesion.update(comentario);
	}

}
