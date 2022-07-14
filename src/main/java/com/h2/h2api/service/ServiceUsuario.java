package com.h2.h2api.service;

import java.util.Optional;

import com.h2.h2api.model.Usuario;

public interface ServiceUsuario {
	
	Usuario saveUser(Usuario user);
	
	Optional<Usuario> getUsuario(Long idUser);
	
	Usuario userToChangue(Long id, Usuario user);
	
	boolean deleteUser(Long id);

}
