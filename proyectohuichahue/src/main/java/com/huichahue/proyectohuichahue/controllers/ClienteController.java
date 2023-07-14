package com.huichahue.proyectohuichahue.controllers;

import com.huichahue.proyectohuichahue.entities.ClienteEntity;
import com.huichahue.proyectohuichahue.services.ClienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // GET POST PUT DELETE
@CrossOrigin("*") //Acepta peticiones desde cualquier lugar
@RequestMapping("clientes")// indica ruta base
public class ClienteController {

    @Autowired //Dependencia con el Service
    ClienteServiceImpl clienteService;

    @PostMapping("/nuevo")  //Crear nuevo cliente
    public ResponseEntity<ClienteEntity> crearNuevoCliente(@RequestBody ClienteEntity clienteEntity) {
        return ResponseEntity.ok(clienteService.crearNuevoCliente(clienteEntity));
    }
}
