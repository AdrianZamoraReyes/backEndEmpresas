package com.adrian.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adrian.bean.Empresa;
import com.adrian.dao.EmpresaDao;

@RestController
@RequestMapping("/api/")
public class EmpresaController {
	
	@Autowired
	private EmpresaDao empresaDao;
	
	@RequestMapping(value = "/empresas", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Empresa> getEmpresas() {
		return empresaDao.getEmpresas();
	}
	
	
	

}
