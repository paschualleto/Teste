package com.exemplo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.exemplo.model.Pedido;

@Component
public interface PedidoJpaRepository extends JpaRepository<Pedido, Long>{

}
