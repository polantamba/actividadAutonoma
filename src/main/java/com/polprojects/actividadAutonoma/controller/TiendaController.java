package com.polprojects.actividadAutonoma.controller;

import com.polprojects.actividadAutonoma.entity.*;
import com.polprojects.actividadAutonoma.service.TiendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TiendaController {

    @Autowired private TiendaService service;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("clientes", service.listarClientes());
        model.addAttribute("productos", service.listarProductos());
        model.addAttribute("facturas", service.listarFacturas());
        model.addAttribute("proveedores", service.listarProveedores());
        return "index";
    }

    @GetMapping("/nuevoCliente")
    public String formCliente(Model model) {
        model.addAttribute("cliente", new Cliente());
        return "formCliente";
    }
    @PostMapping("/guardarCliente")
    public String guardarCliente(Cliente cliente) {
        service.guardarCliente(cliente);
        return "redirect:/";
    }

    @GetMapping("/nuevoProveedor")
    public String formProveedor(Model model) {
        model.addAttribute("proveedor", new Proveedor());
        return "formProveedor";
    }
    @PostMapping("/guardarProveedor")
    public String guardarProveedor(Proveedor proveedor) {
        service.guardarProveedor(proveedor);
        return "redirect:/";
    }


    @GetMapping("/nuevoProducto")
    public String formProducto(Model model) {
        model.addAttribute("producto", new Producto());

        model.addAttribute("listaProveedores", service.listarProveedores());
        return "formProducto";
    }
    @PostMapping("/guardarProducto")
    public String guardarProducto(Producto producto) {
        service.guardarProducto(producto);
        return "redirect:/";
    }


    @GetMapping("/nuevaFactura")
    public String formFactura(Model model) {
        model.addAttribute("factura", new Factura());
        model.addAttribute("listaClientes", service.listarClientes());
        model.addAttribute("listaProductos", service.listarProductos());
        return "formFactura";
    }
    @PostMapping("/guardarFactura")
    public String guardarFactura(Factura factura) {
        service.guardarFactura(factura);
        return "redirect:/";
    }
}