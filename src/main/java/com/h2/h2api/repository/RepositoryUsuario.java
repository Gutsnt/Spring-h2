package com.h2.h2api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.h2.h2api.model.Usuario;

public interface RepositoryUsuario extends JpaRepository<Usuario, Long> {

}
