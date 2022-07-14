package com.h2.h2api.service;

import java.util.Optional;

import org.springframework.beans.factory.config.RuntimeBeanNameReference;
import org.springframework.stereotype.Service;

import com.h2.h2api.model.Usuario;
import com.h2.h2api.repository.RepositoryUsuario;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ServiceUsuarioImpl implements ServiceUsuario {

	private final RepositoryUsuario repositorioUsuario;
	
	@Override
	public Usuario saveUser(Usuario user) {
		
		return repositorioUsuario.save(user);
	}

	@Override
	public Optional<Usuario> getUsuario(Long idUser) {
		
		return repositorioUsuario.findById(idUser);
	}

	@Override
	public Usuario userToChangue(Long id, Usuario user) {
		Usuario usuarioBuscar = repositorioUsuario.findById(id).get();
		usuarioBuscar.setDirection(user.getDirection());
		return repositorioUsuario.save(usuarioBuscar);
	}

	@Override
	public boolean deleteUser(Long id) {
		try {
			repositorioUsuario.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

}
