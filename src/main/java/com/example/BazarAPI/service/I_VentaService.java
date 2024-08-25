package com.example.BazarAPI.service;

import com.example.BazarAPI.entity.Producto;
import com.example.BazarAPI.entity.Venta;

import java.time.LocalDate;
import java.util.List;

public interface I_VentaService {

    public void crearVenta(Venta venta);
    public List<Venta> traerVentas();
    public Venta traerVenta(Long id);
    public void eliminarVenta(Long id);
    public void editarVenta(Long id, Venta venta);

}
