package br.com.projeto.NotasFiscais.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.projeto.NotasFiscais.model.Nota;

public interface NotaRepository extends JpaRepository<Nota,Integer>{
}
