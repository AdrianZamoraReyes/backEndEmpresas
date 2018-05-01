package com.adrian.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contratado")
public class Contratado implements Serializable {
	
	private static final long serialVersionUID = 4727319308264764127L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idContratado;
	private String puesto;
	private Integer idUsuario;
	private Integer idEmpresa;
	private Date fechaInicio;
	private Date fechaFinal;
	
	public Contratado() {
		
	}

	public Contratado(Integer idContratado, String puesto, Integer idUsuario, Integer idEmpresa, Date fechaInicio,
			Date fechaFinal) {
		super();
		this.idContratado = idContratado;
		this.puesto = puesto;
		this.idUsuario = idUsuario;
		this.idEmpresa = idEmpresa;
		this.fechaInicio = fechaInicio;
		this.fechaFinal = fechaFinal;
	}

	public Integer getIdContratado() {
		return idContratado;
	}

	public void setIdContratado(Integer idContratado) {
		this.idContratado = idContratado;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
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

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

}
