package com.adrian.dao;

import java.util.List;

import com.adrian.bean.Empresa;


public interface EmpresaDao {
	
	List<Empresa> getEmpresas();
	
	List<Empresa> getEmpresasByTipoEmpresa(int tipoEmpresa);
	
	void insertEmpresa(Empresa empresa);
	
	Empresa getEmpresaById(int idEmpresa);
	
	void deleteEmpresa(int idEmpresa);
	
	void editEmpresa(Empresa empresa);

}
