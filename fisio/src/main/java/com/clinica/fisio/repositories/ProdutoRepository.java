package com.clinica.fisio.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clinica.fisio.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	  List<Produto> findByQuantidadeLessThanEqual(int limite);
	  List<Produto> findByQuantidadeLessThanEqualEstoqueMinimo();

}
