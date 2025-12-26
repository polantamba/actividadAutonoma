package com.polprojects.actividadAutonoma.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "cliente")
public class Cliente {

    @Id
    @Column(length = 10)
    private String cedula;

    @Column(length = 45)
    private String nombre;

    @Column(length = 45)
    private String apellido;

    @Column(length = 45)
    private String direccion;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fecha_nacimiento;
}