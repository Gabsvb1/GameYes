package com.example.gameyes.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;


import com.example.gameyes.model.Produto;


public interface ProdutoRepository extends JpaRepository <Produto, Long> {
	
	
	  List<Produto> findAllBynomeContainingIgnoreCase(@Param("nome") String nome);

}
