package com.huichahue.proyectohuichahue.controllers;

import com.huichahue.proyectohuichahue.entities.CategoriaEntity;
import com.huichahue.proyectohuichahue.services.CategoriaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController // GET POST PUT DELETE
@CrossOrigin("*") //Aceptar peticiones desde cualquier lugar
@RequestMapping("categorias") // indica la ruta base
public class CategoriaController {

    @Autowired //Dependencia con el Service
    CategoriaServiceImpl categoriaService;



}
