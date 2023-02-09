package br.com.projeto.NotasFiscais.controller;

//import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import br.com.projeto.NotasFiscais.model.Cliente;
//import br.com.projeto.NotasFiscais.model.Clientes;
import br.com.projeto.NotasFiscais.repository.ClienteRepository;



@RestController
@RequestMapping("clientes")
public class ClientesController {
	
	@Autowired
	private ClienteRepository repository;
	
	@PostMapping(value = "salvar")
	@ResponseBody
	public void cadastrarClientes(@RequestBody Cliente dados){
		//repository.save(dados.codigoCliente,dados.nomeCliente);
		repository.save(dados);
		
	}
	
	
}
