package com.educandoweb.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.curso.entidades.Usuario;

@RestController
@RequestMapping(value="/usuarios")
public class UsuarioResource {
	
	@GetMapping
	public ResponseEntity<Usuario> acharTodos() {
		Usuario u = new Usuario(1L, "Maria", "maria@gmail.com", "99999999", "12345");
		return ResponseEntity.ok().body(u);
	}
}
