package com.douglas.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.douglas.cursomc.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
