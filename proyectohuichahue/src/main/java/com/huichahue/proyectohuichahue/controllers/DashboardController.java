package com.huichahue.proyectohuichahue.controllers;

import com.huichahue.proyectohuichahue.entities.CategoriaEntity;
import com.huichahue.proyectohuichahue.entities.ClienteEntity;
import com.huichahue.proyectohuichahue.entities.OrdenEntity;
import com.huichahue.proyectohuichahue.entities.ProductoEntity;
import com.huichahue.proyectohuichahue.services.CategoriaServiceImpl;
import com.huichahue.proyectohuichahue.services.ClienteServiceImpl;
import com.huichahue.proyectohuichahue.services.OrdenServiceImpl;
import com.huichahue.proyectohuichahue.services.ProductoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController // GET POST PUT DELETE
@CrossOrigin("*") //Aceptar peticiones desde cualquier lugar
@RequestMapping("dashboardaAdmin") // indica la ruta base
public class DashboardController {

    @Autowired //Dependencia con el Service de CATEGORIA
    CategoriaServiceImpl categoriaService;

    @Autowired //Dependencia con el Service de CLIENTE
    ClienteServiceImpl clienteService;

    @Autowired //Dependencia con el Service  de ORDEN
    OrdenServiceImpl ordenService;

    @Autowired //Dependencia con el Service de PRODUCTO
    ProductoServiceImpl productoService;

    @PostMapping("nuevaCategoria")
    public ResponseEntity<CategoriaEntity> guardarNuevaCategoria(@RequestBody CategoriaEntity categoriaEntity) {
        return ResponseEntity.ok(categoriaService.guardarCategoria(categoriaEntity));
    }

    @GetMapping("/listaCategorias")
    public ResponseEntity<List<CategoriaEntity>> obtenerTodasLasCategorias() {
        return ResponseEntity.ok(categoriaService.obtenerCategoria());
    }
    @DeleteMapping("borrarCategoria/{id}")
    public void borrarCategoriaPorId(@PathVariable("id")Long id) {
        categoriaService.borrarCategoriaPorId(id);
    }

    @GetMapping("/listaClientes") // obtener lista de clientes
    public ResponseEntity<List<ClienteEntity>> obtenerTodosLosClientes() {
        return ResponseEntity.ok(clienteService.obtenerClientes());
    }
    @DeleteMapping("borrarCliente/{id}")
    public void borrarClientePorId(@PathVariable("id")Long id) {
        clienteService.borrarClientePorId(id);
    }
    @GetMapping("/listaOrdenes")
    public ResponseEntity<List<OrdenEntity>> obtenerTodasLasOrdenes() {
        return ResponseEntity.ok(ordenService.obtenerOrdenes());
    }

    @GetMapping("/listaProductos") //Leer-traer lista de Productos
    public ResponseEntity<List<ProductoEntity>> obtenerTodosLosProductos() {
        return ResponseEntity.ok(productoService.obtenerProductos());
    }

    @PostMapping("nuevoProducto")
    public ResponseEntity<ProductoEntity> guardarNuevoProducto(@RequestBody ProductoEntity productoEntity) {
        return ResponseEntity.ok(productoService.guardarNuevoProducto(productoEntity));
    }

    @DeleteMapping("borrarProducto/{id}")
    public void borrarProductoPorId(@PathVariable("id")Long id) {
        productoService.borrarProductoPorId(id);
    }
}

