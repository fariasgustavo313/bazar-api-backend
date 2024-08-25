package com.example.BazarAPI.service;

import com.example.BazarAPI.entity.Cliente;

import java.util.List;

public interface I_ClienteService {

    public void crearCliente(Cliente cliente);
    public List<Cliente> traerClientes();
    public Cliente traerCliente(Long id);
    public void eliminarCliente(Long id);
    public void editarCliente(Long id, Cliente cliente);
}
