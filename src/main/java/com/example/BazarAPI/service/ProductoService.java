package com.example.BazarAPI.service;

import com.example.BazarAPI.entity.Producto;
import com.example.BazarAPI.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductoService implements I_ProductoService {

    @Autowired
    private ProductoRepository productoRepository;
    @Override
    public void crearProducto(Producto producto) {
        productoRepository.save(producto);
    }

    @Override
    public List<Producto> traerProductos() {
        return productoRepository.findAll();
    }

    @Override
    public Producto traerProducto(Long id) {
        return productoRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminarProducto(Long id) {
        productoRepository.deleteById(id);
    }

    @Override
    public void editarProducto(Long id, Producto producto) {
        Producto prod = this.traerProducto(id);
        prod.setNombre(producto.getNombre());
        prod.setMarca(producto.getMarca());
        prod.setCosto(producto.getCosto());
        prod.setCantidad_disponible(producto.getCantidad_disponible());

        this.crearProducto(prod);
    }

    @Override
    public List<Producto> ObtenerProductosPorCantidad(int cantidad) {
        List<Producto> listaProductos = this.traerProductos();
        List<Producto> listaProdCantidad = new ArrayList<>();
        for (Producto producto : listaProductos) {
            if (cantidad >= producto.getCantidad_disponible()) {
                listaProdCantidad.add(producto);
            }
        }
        return listaProdCantidad;
    }
}
