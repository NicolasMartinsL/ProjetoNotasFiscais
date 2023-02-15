package br.com.projeto.NotasFiscais.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.projeto.NotasFiscais.model.Cliente;

public  interface ClienteRepository extends JpaRepository<Cliente,Integer>{
}
