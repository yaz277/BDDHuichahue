package com.huichahue.proyectohuichahue.controllers;

import com.huichahue.proyectohuichahue.entities.OrdenEntity;
import com.huichahue.proyectohuichahue.services.OrdenServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // GET POST PUT DELETE
@CrossOrigin("*") //Aceptar peticiones desde cualquier lugar
@RequestMapping("ordenes")// indica ruta base
public class OrdenController {

    @Autowired //Dependencia con el Service
    OrdenServiceImpl ordenService;

    @GetMapping("/listaOrdenes")
    public ResponseEntity<List<OrdenEntity>> obtenerTodasLasOrdenes() {
        return ResponseEntity.ok(ordenService.obtenerOrdenes());
    }


}
