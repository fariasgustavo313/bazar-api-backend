package com.example.BazarAPI.controller;

import com.example.BazarAPI.entity.Venta;
import com.example.BazarAPI.service.I_VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/ventas")
public class VentaController {

    @Autowired
    private I_VentaService ventaService;

    @PostMapping
    public String crearVenta(@RequestBody Venta venta) {
        ventaService.crearVenta(venta);
        return "Venta creada con exito";
    }

    @GetMapping
    public List<Venta> traerVentas() {
        return ventaService.traerVentas();
    }

    @GetMapping("/{id}")
    public Venta traerVenta(@PathVariable Long id) {
        return ventaService.traerVenta(id);
    }

    @DeleteMapping("/{id}")
    public String eliminarVenta(@PathVariable Long id) {
        ventaService.eliminarVenta(id);
        return "Venta eliminada con exito";
    }

    @PutMapping("/{id}")
    public String editarVenta(@PathVariable Long id,
                              @RequestBody Venta venta) {
        ventaService.editarVenta(id, venta);
        return "Venta actualizada con exito";
    }
}
