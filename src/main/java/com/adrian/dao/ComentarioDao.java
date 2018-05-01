package com.adrian.dao;

import java.util.List;

import com.adrian.bean.Comentario;

public interface ComentarioDao {
	
	List<Comentario> getComentarios();
	
	void insertComentario(Comentario comentario);
	
	Comentario getComentarioById(int idComentario);
	
	void deleteComentario(int idComentario);
	
	void editComentario(Comentario comentario);

}
