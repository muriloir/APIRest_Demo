package com.example.demo.Repository;
import com.example.demo.Entity.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    Cliente findById(long id);
}