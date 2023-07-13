package com.huichahue.proyectohuichahue.services;

import com.huichahue.proyectohuichahue.entities.ProductoEntity;
import com.huichahue.proyectohuichahue.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    ProductoRepository productoRepository;

    @Override
    public List<ProductoEntity> obtenerProductos() {

        List<ProductoEntity> listaProductos = productoRepository.findAll();
        return listaProductos;
    }

    @Override
    public ProductoEntity guardarNuevoProducto(ProductoEntity nuevoProducto) {
        return productoRepository.save(nuevoProducto);
    }

    @Override
    public void borrarProductoPorId(Long id) {
            productoRepository.deleteById(id);
    }


}
