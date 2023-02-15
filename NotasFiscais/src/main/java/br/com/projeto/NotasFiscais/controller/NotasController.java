package br.com.projeto.NotasFiscais.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import br.com.projeto.NotasFiscais.model.Nota;
import br.com.projeto.NotasFiscais.repository.NotaRepository;


@RestController
@RequestMapping("/nota")
public class NotasController {
	
	@Autowired
	private NotaRepository repository;
	

	@PostMapping
	public @ResponseBody void cadastrar(@RequestBody Nota dados){
		repository.save(dados);
	}

	@GetMapping
	public @ResponseBody List<Nota> listar(){
		return repository.findAll();
	}
	
	@GetMapping("/{id}")
	public @ResponseBody Optional<Nota> listarPorId(@PathVariable Integer id) {
		return repository.findById(id);
	}
	
	@PutMapping
	public @ResponseBody Nota alterar(@RequestBody Nota dados) {
		return repository.save(dados);
	}
	
	@DeleteMapping("/{id}")
	public @ResponseBody void remover(@PathVariable Integer id) {
		this.repository.deleteById(id);
	}
}
