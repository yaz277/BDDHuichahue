package com.huichahue.proyectohuichahue.repositories;

import com.huichahue.proyectohuichahue.entities.CategoriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Anotación
// extends (hereda de JpaRepository)
// JpaRepository proporciona métodos de acceso y manipulación de dato como creación, lectura, actualización y eliminación (CRUD)
public interface CategoriaRepository extends JpaRepository<CategoriaEntity,Long> { //<recibe el objeto Categoria y el tipo de dato del ID, en este caso es Long>
}
