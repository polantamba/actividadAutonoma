package com.polprojects.actividadAutonoma.repository;
import com.polprojects.actividadAutonoma.entity.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor, Integer> { }