package io.github.arthurmadalena.produtosapi.controller;

import io.github.arthurmadalena.produtosapi.model.Produto;
import io.github.arthurmadalena.produtosapi.repositories.ProdutoRespository;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public Produto getProdutoById(@PathVariable("id") String id) {
        return produtoRespository.findById(id).orElse(null);
    }

    @DeleteMapping("{id}")
    public void deleteById (@PathVariable("id") String id) {
        produtoRespository.deleteById(id);
    }

    @PutMapping("{id}")
    public void updateProduct (@PathVariable("id") String id, @RequestBody Produto produto) {
        produto.setId(id);
        produtoRespository.save(produto);
    }

}
