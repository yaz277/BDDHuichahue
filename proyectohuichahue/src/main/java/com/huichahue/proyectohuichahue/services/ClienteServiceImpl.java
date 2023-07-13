package com.huichahue.proyectohuichahue.services;

import com.huichahue.proyectohuichahue.entities.ClienteEntity;
import com.huichahue.proyectohuichahue.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public List<ClienteEntity> obtenerClientes() {
        List<ClienteEntity> listaClientes = clienteRepository.findAll();
        return listaClientes;
    }
    @Override
    public ClienteEntity crearNuevoCliente(ClienteEntity nuevoCliente) {
        ClienteEntity clienteParaGuardar = clienteRepository.save(nuevoCliente);
        return clienteParaGuardar;
    }


}
