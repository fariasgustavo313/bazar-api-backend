package com.example.BazarAPI.controller;

import com.example.BazarAPI.entity.Cliente;
import com.example.BazarAPI.service.I_ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private I_ClienteService clienteService;

    @PostMapping
    public String crearCliente(@RequestBody Cliente cliente) {
        clienteService.crearCliente(cliente);
        return "Cliente creado con exito";
    }

    @GetMapping
    public List<Cliente> traerClientes() {
        return clienteService.traerClientes();
    }

    @GetMapping("/{id}")
    public Cliente traerCliente(@PathVariable Long id) {
        return clienteService.traerCliente(id);
    }

    @DeleteMapping("/{id}")
    public String eliminarCliente(@PathVariable Long id) {
        clienteService.eliminarCliente(id);
        return "Cliente eliminado con exito";
    }

    @PutMapping("/{id}")
    public String editarCliente(@PathVariable Long id,
                                @RequestBody Cliente cliente) {
        clienteService.editarCliente(id, cliente);
        return "Cliente actualizado con exito";
    }
}
