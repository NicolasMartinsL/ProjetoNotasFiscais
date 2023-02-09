package br.com.projeto.NotasFiscais.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.NotasFiscais.model.Cliente;
import br.com.projeto.NotasFiscais.model.Item;
import br.com.projeto.NotasFiscais.model.Nota;


public interface NotaRepository extends JpaRepository<Nota,Integer>{

	void save(Cliente clienteNota, String dataNota, Integer numeroNota, Item itensNota, Double valorNota);

}
