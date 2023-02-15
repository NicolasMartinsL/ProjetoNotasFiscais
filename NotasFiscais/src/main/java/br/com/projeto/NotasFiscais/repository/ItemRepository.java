package br.com.projeto.NotasFiscais.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.projeto.NotasFiscais.model.Item;

public interface ItemRepository extends JpaRepository<Item,Integer>{
}
