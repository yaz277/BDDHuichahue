package com.huichahue.proyectohuichahue.repositories;

import com.huichahue.proyectohuichahue.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    //Buscar entidad por username
    UserEntity findUserEntityByUsername(String username);
}
