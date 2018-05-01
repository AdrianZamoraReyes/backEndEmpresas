package com.adrian.dao;

import java.util.List;

import com.adrian.bean.Contratado;

public interface ContratadoDao {
	
	List<Contratado> getContratados();
	
	void insertContratado(Contratado contratado);
	
	Contratado getContratadoById(int idContratado);
	
	void deleteContratado(int idContratado);
	
	void editContratado(Contratado contratado);

}
