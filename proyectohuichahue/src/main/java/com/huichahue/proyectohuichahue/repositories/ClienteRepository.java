package com.huichahue.proyectohuichahue.repositories;

import com.huichahue.proyectohuichahue.entities.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository //Anotación
// extends (hereda de JpaRepository)
// JpaRepository proporciona métodos de acceso y manipulación de dato como creación, lectura, actualización y eliminación (CRUD)
public interface ClienteRepository extends JpaRepository<ClienteEntity,Long> { //<recibe el objeto Clientes y el tipo de dato del ID, en este caso es Long>
}