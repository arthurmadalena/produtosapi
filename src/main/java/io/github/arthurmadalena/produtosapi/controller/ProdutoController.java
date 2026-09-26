package io.github.arthurmadalena.produtosapi.controller;

import io.github.arthurmadalena.produtosapi.model.Produto;
import io.github.arthurmadalena.produtosapi.repositories.ProdutoRespository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    private ProdutoRespository produtoRespository;

    public ProdutoController(ProdutoRespository produtoRespository) {
        this.produtoRespository = produtoRespository;
    }


    @PostMapping
    public Produto save(@RequestBody Produto produto) {
        System.out.println("Produto recebido: " + produto);

        var id = UUID.randomUUID().toString();
        produto.setId(id);

        produtoRespository.save(produto);
        return produto;
    }
}
