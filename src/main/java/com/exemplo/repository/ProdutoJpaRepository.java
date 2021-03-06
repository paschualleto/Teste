package com.exemplo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.exemplo.model.Produto;

@Component
public interface ProdutoJpaRepository extends JpaRepository<Produto, Long>{

}
