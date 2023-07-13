package com.huichahue.proyectohuichahue.services;

import com.huichahue.proyectohuichahue.entities.CategoriaEntity;
import java.util.List;


//Interfaz del service donde declaramos los métodos, por eso es una interfaz
public interface CategoriaService {

    //Declaramos el primer método que es para traernos una lista de los personaje
    List<CategoriaEntity> obtenerCategoria();

    CategoriaEntity guardarCategoria(CategoriaEntity categoriaEntity);

    void borrarCategoriaPorId(Long id);

    CategoriaEntity crearNuevaCategoria(CategoriaEntity nuevaCategoria);
}




