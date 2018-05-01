package com.adrian.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "comentario")
public class Comentario implements Serializable {
	
	private static final long serialVersionUID = -412749586636587698L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idComentario;
	private Integer idUsuario;
	private Integer idEmpresa;
	private String tituloComentario;
	private String comentario;
	private Integer valoracionEmpresa;
	private Integer idRespuesta;
	
	public Comentario() {
		
	}
	
	public Comentario(Integer idUsuario, Integer idEmpresa, String tituloComentario, String comentario,
			Integer valoracionEmpresa, Integer idRespuesta) {
		super();
		this.idUsuario = idUsuario;
		this.idEmpresa = idEmpresa;
		this.tituloComentario = tituloComentario;
		this.comentario = comentario;
		this.valoracionEmpresa = valoracionEmpresa;
		this.idRespuesta = idRespuesta;
	}

	public Integer getIdComentario() {
		return idComentario;
	}

	public void setIdComentario(Integer idComentario) {
		this.idComentario = idComentario;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Integer getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getTituloComentario() {
		return tituloComentario;
	}

	public void setTituloComentario(String tituloComentario) {
		this.tituloComentario = tituloComentario;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Integer getValoracionEmpresa() {
		return valoracionEmpresa;
	}

	public void setValoracionEmpresa(Integer valoracionEmpresa) {
		this.valoracionEmpresa = valoracionEmpresa;
	}

	public Integer getIdRespuesta() {
		return idRespuesta;
	}

	public void setIdRespuesta(Integer idRespuesta) {
		this.idRespuesta = idRespuesta;
	}

}
