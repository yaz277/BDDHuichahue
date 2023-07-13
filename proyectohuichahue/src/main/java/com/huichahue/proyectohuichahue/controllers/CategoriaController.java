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

    @GetMapping("/listaCategorias")
    public ResponseEntity<List<CategoriaEntity>> obtenerTodasLasCategorias() {
        return ResponseEntity.ok(categoriaService.obtenerCategoria());
    }

    //ResponseEntity maneja la respuesta del http y configura la respuesta
    //@RequestBody cuerpo de un objeto
    @PostMapping("nuevaCategoria")
    public  ResponseEntity<CategoriaEntity> guardarNuevaCategoria(@RequestBody CategoriaEntity categoriaEntity) {
        return ResponseEntity.ok(categoriaService.guardarCategoria(categoriaEntity));
    }

    @DeleteMapping("borrar/{id}")
    public void borrarCategoriaPorId(@PathVariable("id")Long id) {
        categoriaService.borrarCategoriaPorId(id);
    }





}
