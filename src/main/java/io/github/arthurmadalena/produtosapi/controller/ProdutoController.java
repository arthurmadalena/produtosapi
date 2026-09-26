package io.github.arthurmadalena.produtosapi.controller;

import io.github.arthurmadalena.produtosapi.model.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    @PostMapping
    public void save(@RequestBody Produto produto) {
        System.out.println("Produto recebido: " + produto);
    }
}
