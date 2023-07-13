package com.huichahue.proyectohuichahue.services;

import com.huichahue.proyectohuichahue.entities.OrdenEntity;
import com.huichahue.proyectohuichahue.repositories.OrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdenServiceImpl implements OrdenService {

    @Autowired
    OrdenRepository ordenRepository;

    @Override
    public List<OrdenEntity> obtenerOrdenes() {
        List<OrdenEntity> listaOrdenes = ordenRepository.findAll();
        return listaOrdenes;
    }
}


