package com.cadastrolojas.apicadastrolojas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadastrolojas.apicadastrolojas.models.Cadastro;

public interface CadastroRepository extends JpaRepository<Cadastro, Long> {
	
	Cadastro findById(long id);

}
