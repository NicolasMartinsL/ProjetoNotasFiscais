package br.com.projeto.NotasFiscais.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.projeto.NotasFiscais.model.Item;
import br.com.projeto.NotasFiscais.repository.ItemRepository;


@RestController
@RequestMapping("itens")
public class ItensController {
	
	@Autowired
	private ItemRepository repository;
	
	@PostMapping
	public void cadastrarItens(@RequestBody Item dados){
		repository.save(dados.numeroItem,dados.produtosItem,dados.quantidadeItem,dados.valorItem);
	}
	
	
}
