package com.huichahue.proyectohuichahue.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//El Dto recibe los datos para el registro
//Es como un borrador una representacion de la entidad para pasar información entre capas para no manipular el objeto
//No es una entidad (no guarda en la Base de Datos
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class RegistroDto {

    String username;
    String password;
    String email;
}
