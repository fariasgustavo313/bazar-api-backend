package com.example.BazarAPI.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_venta;
    LocalDate fecha_venta;
    double total;
    @OneToOne
    private Cliente cliente;
    @OneToMany
    private List<Producto> listaProductos;
}
