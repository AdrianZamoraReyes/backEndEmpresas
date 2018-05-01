package com.adrian.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.adrian.bean.Usuario;
import com.adrian.dao.UsuarioDao;

@RestController
@RequestMapping("/api/")
public class UsuarioController {
	
	@Autowired
	private UsuarioDao usuarioDao;
	
	@RequestMapping(value = "/usuarios", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Usuario> getUsuarios() {
		return usuarioDao.getUsuarios();
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public void addUsuario(@RequestBody Usuario usuario) {
		
		if (usuario.getIdUsuario() == 0) {
			usuarioDao.insertUsuario(usuario);
		} else {
			// edit
			usuarioDao.editUsuario(usuario);
		}
		
	}
	
	@RequestMapping(value = "/edit/{idUsuario}")
	public @ResponseBody Usuario editUsuario(@PathVariable("idUsuario") int idUsuario) {
		return (Usuario) usuarioDao.getUsuarioById(idUsuario);
	}
	
	@RequestMapping(value = "/delete/{idUsuario}")
	public void deletePerson(@PathVariable("idUsuario") int idUsuario) {
		usuarioDao.deleteUsuario(idUsuario);
	}
	
	

}
