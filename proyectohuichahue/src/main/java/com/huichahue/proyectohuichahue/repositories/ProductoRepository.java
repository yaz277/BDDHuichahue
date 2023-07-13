package com.huichahue.proyectohuichahue.repositories;

import com.huichahue.proyectohuichahue.entities.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Anotación
// extends (hereda de JpaRepository)
// JpaRepository proporciona métodos de acceso y manipulación de dato como creación, lectura, actualización y eliminación (CRUD)
public interface ProductoRepository extends JpaRepository<ProductoEntity,Long> { // <recibe el objeto Productos y el tipo de dato del ID, en este caso es Long>
//por lista
    ProductoEntity findBy
        //QUERY PARA TRAER LA LISTA SEGUN CATEGORIA
}



