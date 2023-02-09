package br.com.projeto.NotasFiscais.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.projeto.NotasFiscais.model.Produto;
import br.com.projeto.NotasFiscais.repository.ProdutoRepository;


@RestController
@RequestMapping("produtos")
public class ProdutosController {
	
	@Autowired
	private ProdutoRepository repository;
	
	@PostMapping
	public void cadastrarProdutos(@RequestBody Produto dados){
		repository.save(dados.codigoProduto,dados.descricaoProduto,dados.valorProduto);
	}
	
	
}
