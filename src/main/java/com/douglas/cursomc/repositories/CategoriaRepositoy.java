package com.douglas.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.douglas.cursomc.domain.Categoria;

@Repository
public interface CategoriaRepositoy extends JpaRepository<Categoria, Integer>{

}
