package br.com.projeto.NotasFiscais.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.NotasFiscais.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto,Integer> {

	void save(Integer codigoProduto, String descricaoProduto,BigDecimal valorProduto);

}
