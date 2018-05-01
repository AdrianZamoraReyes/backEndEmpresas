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
@Table (name = "tipoempresa")
public class TipoEmpresa implements Serializable {

	private static final long serialVersionUID = -3611846237648789591L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idTipoEmpresa")
	private Integer idTipoEmpresa;
	
	@JsonIgnore
	@LazyCollection (LazyCollectionOption.FALSE)
	@OneToMany(mappedBy="tipoEmpresa",cascade= CascadeType.ALL)
	private Set<Empresa> empresas;

	
	public TipoEmpresa() {
		
	}

	public Integer getIdTipoEmpresa() {
		return idTipoEmpresa;
	}

	public void setIdTipoEmpresa(Integer idTipoEmpresa) {
		this.idTipoEmpresa = idTipoEmpresa;
	}

	@JsonIgnore
	public Set<Empresa> getEmpresas() {
		return empresas;
	}

	@JsonIgnore
	public void setEmpresas(Set<Empresa> empresas) {
		this.empresas = empresas;
	}
	
	

}
