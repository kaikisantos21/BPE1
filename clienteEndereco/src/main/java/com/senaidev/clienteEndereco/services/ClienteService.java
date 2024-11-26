package com.senaidev.clienteEndereco.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.clienteEndereco.entities.Cliente;
import com.senaidev.clienteEndereco.repositories.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    // Listar todos os clientes
    public List<Cliente> buscarClientes() {
        return clienteRepository.findAll();
    }

    // Buscar cliente por ID
    public l<Cliente> buscarClientesPorId(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    // Salvar cliente
    public Cliente criarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    // Deletar cliente
    public void excluirCliente(Long id) {
        clienteRepository.deleteById(id);
    }
}
