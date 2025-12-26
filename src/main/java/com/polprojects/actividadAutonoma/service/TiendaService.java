package com.polprojects.actividadAutonoma.service;

import com.polprojects.actividadAutonoma.entity.*;
import com.polprojects.actividadAutonoma.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TiendaService {

    @Autowired private ClienteRepository clienteRepo;
    @Autowired private ProductoRepository productoRepo;
    @Autowired private FacturaRepository facturaRepo;
    @Autowired private ProveedorRepository proveedorRepo;

    // --- Lecturas ---
    public List<Cliente> listarClientes() { return clienteRepo.findAll(); }
    public List<Producto> listarProductos() { return productoRepo.findAll(); }
    public List<Factura> listarFacturas() { return facturaRepo.findAll(); }
    public List<Proveedor> listarProveedores() { return proveedorRepo.findAll(); }


    public void guardarCliente(Cliente c) { clienteRepo.save(c); }
    public void guardarProducto(Producto p) { productoRepo.save(p); }
    public void guardarProveedor(Proveedor p) { proveedorRepo.save(p); }


    public void guardarFactura(Factura factura) {


        Producto p = productoRepo.findById(factura.getCodigo_producto()).orElse(null);

        if (p != null) {

            factura.setPrecio(p.getPrecio_unitario());


            double subtotalCalculado = p.getPrecio_unitario() * factura.getCantidad();

            factura.setSubtotal(subtotalCalculado);
            factura.setTotal(subtotalCalculado);
        }

        facturaRepo.save(factura);
    }
}