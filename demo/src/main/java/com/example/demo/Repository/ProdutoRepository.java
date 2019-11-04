package com.example.demo.Repository;
import com.example.demo.Entity.Produto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    Produto findById(long id);
}