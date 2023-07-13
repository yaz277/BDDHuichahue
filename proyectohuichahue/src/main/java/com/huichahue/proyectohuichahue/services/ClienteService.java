package com.huichahue.proyectohuichahue.services;

import com.huichahue.proyectohuichahue.entities.ClienteEntity;

import java.util.List;

public interface ClienteService {


    //Declaramos el primer método que es para traernos una lista de los personaje
    List<ClienteEntity> obtenerClientes();

    ClienteEntity crearNuevoCliente(ClienteEntity nuevoCliente);

}
