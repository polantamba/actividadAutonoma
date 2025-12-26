package com.polprojects.actividadAutonoma.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;

    @Column(length = 45)
    private String nombre;

    private Double precio_unitario;

    private Integer codigo_proveedor;
}