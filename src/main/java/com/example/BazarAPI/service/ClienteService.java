package com.example.BazarAPI.service;

import com.example.BazarAPI.entity.Cliente;
import com.example.BazarAPI.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService implements I_ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public void crearCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> traerClientes() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente traerCliente(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminarCliente(Long id) {
        clienteRepository.deleteById(id);
    }

    @Override
    public void editarCliente(Long id, Cliente cliente) {
        Cliente cli = this.traerCliente(id);
        cli.setNombre(cliente.getNombre());
        cli.setApellido(cliente.getApellido());
        cli.setDni(cliente.getDni());

        this.crearCliente(cli);
    }
}
