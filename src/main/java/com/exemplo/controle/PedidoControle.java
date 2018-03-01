package com.exemplo.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemplo.model.ItemPedido;
import com.exemplo.model.Pedido;
import com.exemplo.repository.PedidoJpaRepository;

@RestController
@RequestMapping("/pedido")
public class PedidoControle {

	@Autowired
	private PedidoJpaRepository pedidoJpaRepository;
	
	@GetMapping(value = "/listar")
	public List<Pedido> listaPedidos(){
		return pedidoJpaRepository.findAll();
	}
	
	@PostMapping(value = "/novo")
	public Pedido salvar(@RequestBody final Pedido pedido) {
		return pedidoJpaRepository.save(pedido);
	}
	
	@DeleteMapping(value = "/deletar/{id}")
	public void deletar(@PathVariable int id) {
		pedidoJpaRepository.delete((long) id);
	}

}
