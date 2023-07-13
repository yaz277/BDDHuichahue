package com.huichahue.proyectohuichahue.repositories;

import com.huichahue.proyectohuichahue.entities.OrdenEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Anotación
// extends (hereda de JpaRepository)
// JpaRepository proporciona métodos de acceso y manipulación de dato como creación, lectura, actualización y eliminación (CRUD)
public interface OrdenRepository extends JpaRepository<OrdenEntity,Long> { // <recibe el objeto Orden y el tipo de dato del ID, en este caso es Long>
}

