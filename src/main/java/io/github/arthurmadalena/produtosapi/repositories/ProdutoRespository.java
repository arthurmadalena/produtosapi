package io.github.arthurmadalena.produtosapi.repositories;

import io.github.arthurmadalena.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRespository extends JpaRepository<Produto, String> {

}
