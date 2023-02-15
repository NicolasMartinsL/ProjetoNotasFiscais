package br.com.projeto.NotasFiscais.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.projeto.NotasFiscais.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto,Integer> {
}
