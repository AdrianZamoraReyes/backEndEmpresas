package com.adrian.bean;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table (name = "tipousuario")
public class TipoUsuario implements Serializable {
	
	private static final long serialVersionUID = 8797983776031724246L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idTipoUsuario")
	private Integer idTipoUsuario;
	
	@Column(name="nombreTipoUsuario")
	private String nombreTipoUsuario;
	
	@Column(name="descripcionTipoUsuario")
	private String descripcionTipoUsuario;
	
	@JsonIgnore
	@LazyCollection (LazyCollectionOption.FALSE)
	@OneToMany(mappedBy="tipoUsuario",cascade= CascadeType.ALL)
	private Set<Usuario> usuarios;

	public TipoUsuario() {
		
	}

	public TipoUsuario(String nombreTipoUsuario, String descripcionTipoUsuario) {
		super();
		this.nombreTipoUsuario = nombreTipoUsuario;
		this.descripcionTipoUsuario = descripcionTipoUsuario;
	}

	public Integer getIdTipoUsuario() {
		return idTipoUsuario;
	}

	public void setIdTipoUsuario(Integer idTipoUsuario) {
		this.idTipoUsuario = idTipoUsuario;
	}

	public String getNombreTipoUsuario() {
		return nombreTipoUsuario;
	}

	public void setNombreTipoUsuario(String nombreTipoUsuario) {
		this.nombreTipoUsuario = nombreTipoUsuario;
	}

	public String getDescripcionTipoUsuario() {
		return descripcionTipoUsuario;
	}

	public void setDescripcionTipoUsuario(String descripcionTipoUsuario) {
		this.descripcionTipoUsuario = descripcionTipoUsuario;
	}

	@JsonIgnore
	public Set<Usuario> getUsuarios() {
		return usuarios;
	}

	@JsonIgnore
	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

}
