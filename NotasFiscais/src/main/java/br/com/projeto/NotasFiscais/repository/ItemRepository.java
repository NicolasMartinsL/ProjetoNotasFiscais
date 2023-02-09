package br.com.projeto.NotasFiscais.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.projeto.NotasFiscais.model.Item;
import br.com.projeto.NotasFiscais.model.Produto;


public interface ItemRepository extends JpaRepository<Item,Integer>{

	void save(Integer numeroItem, Produto produtosItem, BigDecimal quantidadeItem, BigDecimal valorItem);

}
