package com.example.BazarAPI.controller;

import com.example.BazarAPI.entity.Producto;
import com.example.BazarAPI.service.I_ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private I_ProductoService productoService;

    @PostMapping
    public String crearProducto(@RequestBody Producto producto) {
        productoService.crearProducto(producto);
        return "Producto creado con exito";
    }

    @GetMapping
    public List<Producto> traerProductos() {
        return productoService.traerProductos();
    }

    @GetMapping("/{id}")
    public Producto traerProducto(@PathVariable Long id) {
        return productoService.traerProducto(id);
    }

    @DeleteMapping("/{id}")
    public String eliminarProducto(@PathVariable Long id) {
        productoService.eliminarProducto(id);
        return "Producto eliminado con exito";
    }

    @PutMapping("/{id}")
    public String editarProducto(@PathVariable Long id,
                                 @RequestBody Producto producto) {
        productoService.editarProducto(id, producto);
        return "Producto actualizado con exito";
    }

    @GetMapping("/buscar/{cantidad}")
    public List<Producto> ObtenerProductosPorCantidad(@PathVariable int cantidad) {
        return productoService.ObtenerProductosPorCantidad(cantidad);
    }
}
