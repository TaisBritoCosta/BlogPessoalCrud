package com.generation.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	 // Metodo que busca um usuario pelo seu usuario(email)//
	
	public Optional<Usuario> findByUsuario(String usuario);
	public List<Usuario> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);

	
}
