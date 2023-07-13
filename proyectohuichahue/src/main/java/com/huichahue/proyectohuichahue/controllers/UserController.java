/*package com.huichahue.proyectohuichahue.controllers;

import com.huichahue.proyectohuichahue.dto.RegistroDto;
import com.huichahue.proyectohuichahue.services.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController // GET POST PUT DELETE
@CrossOrigin("*") //Acepta peticiones desde cualquier lugar
@RequestMapping("/user") // indica la ruta base
public class UserController {
    @Autowired
    MyUserDetailsService myUserDetailsService;


    @PostMapping("/register")
    public ResponseEntity<?> crearNuevoUsuario(@RequestBody RegistroDto datosUsuario) {
        myUserDetailsService.guardarNuevoUsuario(datosUsuario);
        return new ResponseEntity<>("Registro fue exitoso", HttpStatus.OK);
    }



}*/