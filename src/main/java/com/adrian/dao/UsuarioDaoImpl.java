package com.adrian.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.adrian.bean.Usuario;

@Repository
public class UsuarioDaoImpl implements UsuarioDao {

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public List<Usuario> getUsuarios() {
		Session sesion = sessionFactory.getCurrentSession();
		return (List<Usuario>)sesion.createQuery("From Usuario").list();
	}
	
	@Transactional
	@Override
	public List<Usuario> getUsuariosByTipoUsuario(int tipoUsuario) {
		Session sesion = sessionFactory.getCurrentSession();
		return (List<Usuario>)sesion.createQuery("From Usuario WHERE idTipoUsuario = ").list(); // <-- TODO Cambiar Query
	}

	@Transactional
	@Override
	public void insertUsuario(Usuario usuario) {
		Session sesion = sessionFactory.getCurrentSession();
		sesion.persist(usuario);
	}
	
	@Transactional
	@Override
	public Usuario getUsuarioById(int idUsuario) {
		Session sesion = sessionFactory.getCurrentSession();
		return (Usuario)sesion.get(Usuario.class, idUsuario);
	}

	@Transactional
	@Override
	public void deleteUsuario(int idUsuario) {
		Session sesion = sessionFactory.getCurrentSession();
		sesion.delete(getUsuarioById(idUsuario));
	}
	
	@Transactional
	@Override
	public void editUsuario(Usuario usuario) {
		Session sesion = sessionFactory.getCurrentSession();
		sesion.update(usuario);
	}

	
	

}
