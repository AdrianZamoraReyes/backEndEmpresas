package com.adrian.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.adrian.bean.Empresa;

@Repository
public class EmpresaDaoImpl implements EmpresaDao {
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public List<Empresa> getEmpresas() {
		Session sesion = sessionFactory.getCurrentSession();
		return (List<Empresa>)sesion.createQuery("From Empresa").list();
	}

	@Transactional
	@Override
	public List<Empresa> getEmpresasByTipoEmpresa(int tipoEmpresa) {
		// TODO A implementar
		return null;
	}

	@Transactional
	@Override
	public void insertEmpresa(Empresa empresa) {
		Session sesion = sessionFactory.getCurrentSession();
		sesion.persist(empresa);
	}

	@Transactional
	@Override
	public Empresa getEmpresaById(int idEmpresa) {
		Session sesion = sessionFactory.getCurrentSession();
		return (Empresa)sesion.get(Empresa.class, idEmpresa);
	}

	@Transactional
	@Override
	public void deleteEmpresa(int idEmpresa) {
		Session sesion = sessionFactory.getCurrentSession();
		sesion.delete(getEmpresaById(idEmpresa));
	}

	@Transactional
	@Override
	public void editEmpresa(Empresa empresa) {
		Session sesion = sessionFactory.getCurrentSession();
		sesion.update(empresa);
		
	}

}
