package com.example.BazarAPI.service;

import com.example.BazarAPI.entity.Producto;
import com.example.BazarAPI.entity.Venta;
import com.example.BazarAPI.repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class VentaService implements I_VentaService {

    @Autowired
    private VentaRepository ventaRepository;

    @Override
    public void crearVenta(Venta venta) {
        ventaRepository.save(venta);
    }

    @Override
    public List<Venta> traerVentas() {
        return ventaRepository.findAll();
    }

    @Override
    public Venta traerVenta(Long id) {
        return ventaRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminarVenta(Long id) {
        ventaRepository.deleteById(id);
    }

    @Override
    public void editarVenta(Long id, Venta venta) {
        Venta vta = this.traerVenta(id);
        vta.setFecha_venta(venta.getFecha_venta());
        vta.setTotal(venta.getTotal());
        vta.setCliente(venta.getCliente());
        vta.setListaProductos(venta.getListaProductos());

        this.crearVenta(vta);
    }
}
