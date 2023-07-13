package com.huichahue.proyectohuichahue.controllers;

import com.huichahue.proyectohuichahue.entities.ProductoEntity;
import com.huichahue.proyectohuichahue.services.ProductoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // GET POST PUT DELETE
@CrossOrigin("*") //Acepta peticiones desde cualquier lugar
@RequestMapping("productos")// indica ruta base
public class ProductoController {

    @Autowired //Dependencia con el Service
    ProductoServiceImpl productoService;

    @GetMapping("/listaProductos") //Leer-traer lista de Productos
    public ResponseEntity<List<ProductoEntity>> obtenerTodosLosProductos() {
        return ResponseEntity.ok(productoService.obtenerProductos());
    }

    //guardar


    @DeleteMapping("borrarProducto/{id}")
    public void borrarProductoPorId(@PathVariable("id")Long id) {
        productoService.borrarProductoPorId(id);
    }
}
