package com.example.demo.Controller;
import java.util.*;
import com.example.demo.Entity.Cliente;
import com.example.demo.Repository.ClienteRepository;
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
public class  ClienteController {
    @Autowired
    ClienteRepository clienteRepository;

    @GetMapping("/clientes")
    public List<Cliente> listaClientes(){
        return clienteRepository.findAll();
    }
    
    @GetMapping("/clientes/{id}")
    public Cliente listaClienteUnico(@PathVariable(value="id") long id) {
        return clienteRepository.findById(id);
    }

    @PostMapping("/clientes/add")
    public Cliente salvarCliente(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @DeleteMapping("/clientes/delete")
    public void deletarCliente(@RequestBody Cliente cliente) {
        clienteRepository.delete(cliente);
    }

    @PutMapping("/clientes/update")
    public Cliente atualizarCliente(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

}