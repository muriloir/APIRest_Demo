package com.example.demo.Controller;
import java.util.*;
import com.example.demo.Entity.Produto;
import com.example.demo.Repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class  ProdutoController {
    @Autowired
    ProdutoRepository produtoRepository;

    @GetMapping("/produtos")
    public List<Produto> listaProdutos(){
        return produtoRepository.findAll();
    }
    
    @GetMapping("/produtos/{id}")
    public Produto listaProdutoUnico(@PathVariable(value="id") long id) {
        return produtoRepository.findById(id);
    }

    @PostMapping("/produtos/add")
    public Produto salvarProduto(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }

    @DeleteMapping("/produtos/delete")
    public void deletarProduto(@RequestBody Produto produto) {
        produtoRepository.delete(produto);
    }

    @PutMapping("/produtos/update")
    public Produto atualizarProduto(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }

}