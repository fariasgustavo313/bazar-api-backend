package com.example.BazarAPI.service;

import com.example.BazarAPI.entity.Producto;

import java.util.List;

public interface I_ProductoService {

    public void crearProducto(Producto producto);
    public List<Producto> traerProductos();
    public Producto traerProducto(Long id);
    public void eliminarProducto(Long id);
    public void editarProducto(Long id, Producto producto);
    public List<Producto> ObtenerProductosPorCantidad(int cantidad);
}
