package com.huichahue.proyectohuichahue.services;

import com.huichahue.proyectohuichahue.entities.ProductoEntity;
import java.util.List;

public interface ProductoService {
    List<ProductoEntity> obtenerProductos();
    ProductoEntity guardarNuevoProducto(ProductoEntity nuevoProducto);

    void borrarProductoPorId(Long id);

}
