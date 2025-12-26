package com.polprojects.actividadAutonoma.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "factura")
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer numero;

    @Column(length = 10)
    private String cedula_cliente;

    private Integer codigo_producto;

    private Integer cantidad;


    private Double precio;
    private Double subtotal;
    private Double total;
}