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

import com.exemplo.repository.ProdutoJpaRepository;
import com.exemplo.model.Produto;

@RestController
@RequestMapping("/produto")
public class ProdutoControle {

	@Autowired
	private ProdutoJpaRepository produtoJpaRepository;
	
	@GetMapping(value = "/listar")
	public List<Produto> listaTodos(){
		return produtoJpaRepository.findAll();
	}
	
	@PostMapping(value = "/novo")
	public Produto salvar(@RequestBody final Produto produto) {
		return produtoJpaRepository.save(produto);
	}
	
	@DeleteMapping(value = "/deletar/{id}")
	public void deletar(@PathVariable int id) {
		produtoJpaRepository.delete((long) id);
	}
}
