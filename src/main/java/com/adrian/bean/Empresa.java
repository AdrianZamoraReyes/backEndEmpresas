package com.adrian.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "empresa")
public class Empresa implements Serializable {
	
	private static final long serialVersionUID = -105788455555181977L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idEmpresa;
	
	private String nombreEmpresa;
	
	private String direccionEmpresa;
	
	private String paisEmpresa;
	
	//private Integer idTipoEmpresa;
	
	@ManyToOne
	@JoinColumn(name="idTipoEmpresa")
	private TipoEmpresa tipoEmpresa;
	
	public Empresa() {
		
	}

	public Empresa(String nombreEmpresa, String direccionEmpresa, String paisEmpresa) {
		super();
		this.nombreEmpresa = nombreEmpresa;
		this.direccionEmpresa = direccionEmpresa;
		this.paisEmpresa = paisEmpresa;
	}

	public Integer getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getDireccionEmpresa() {
		return direccionEmpresa;
	}

	public void setDireccionEmpresa(String direccionEmpresa) {
		this.direccionEmpresa = direccionEmpresa;
	}

	public String getPaisEmpresa() {
		return paisEmpresa;
	}

	public void setPaisEmpresa(String paisEmpresa) {
		this.paisEmpresa = paisEmpresa;
	}

	public TipoEmpresa getTipoEmpresa() {
		return tipoEmpresa;
	}

	public void setTipoEmpresa(TipoEmpresa tipoEmpresa) {
		this.tipoEmpresa = tipoEmpresa;
	}

}
