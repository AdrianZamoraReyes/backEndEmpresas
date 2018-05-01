package com.adrian.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {
	
	private static final long serialVersionUID = -2560563998278287814L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idUsuario")
	private Integer idUsuario;
	
	/*@Column(name="idTipoUsuario")
	private Integer idTipoUsuario;*/
	
	@Column(name="nombreUsuario")
	private String nombreUsuario;
	
	@Column(name="passUsuario")
	private String passUsuario;
	
	@Column(name="emailUsuario")
	private String emailUsuario;
	
	@ManyToOne
	@JoinColumn(name="idTipoUsuario")
	private TipoUsuario tipoUsuario;
	
	public Usuario() {
		
	}

	public Usuario(String nombreUsuario, String passUsuario, String emailUsuario) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.passUsuario = passUsuario;
		this.emailUsuario = emailUsuario;
	}


	public Integer getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}


	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}


	public String getPassUsuario() {
		return passUsuario;
	}


	public void setPassUsuario(String passUsuario) {
		this.passUsuario = passUsuario;
	}


	public String getEmailUsuario() {
		return emailUsuario;
	}


	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
	
	
	

}
