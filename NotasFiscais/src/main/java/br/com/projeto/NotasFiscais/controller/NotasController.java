package br.com.projeto.NotasFiscais.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.projeto.NotasFiscais.model.Nota;
import br.com.projeto.NotasFiscais.repository.NotaRepository;



@RestController
@RequestMapping("notas")
public class NotasController {
	
	@Autowired
	private NotaRepository repository;
	
	@PostMapping
	public void cadastrarNotas(@RequestBody Nota dados){
		repository.save(dados.clienteNota,dados.dataNota,dados.numeroNota,dados.itensNota,dados.valorNota);
	}
	
	
}
