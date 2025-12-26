package com.polprojects.actividadAutonoma.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "proveedor")
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;

    @Column(length = 45)
    private String nombre;

    @Column(length = 45)
    private String direccion;
}