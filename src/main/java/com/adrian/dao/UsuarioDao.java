package com.adrian.dao;

import java.util.List;

import com.adrian.bean.Usuario;

public interface UsuarioDao {
	
	List<Usuario> getUsuarios();
	
	List<Usuario> getUsuariosByTipoUsuario(int tipoUsuario);
	
	void insertUsuario(Usuario usuario);
	
	Usuario getUsuarioById(int idUsuario);
	
	void deleteUsuario(int idUsuario);
	
	void editUsuario(Usuario usuario);

}
