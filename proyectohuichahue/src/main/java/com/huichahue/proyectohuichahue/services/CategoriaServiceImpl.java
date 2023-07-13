package com.huichahue.proyectohuichahue.services;

import com.huichahue.proyectohuichahue.entities.CategoriaEntity;
import com.huichahue.proyectohuichahue.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    CategoriaRepository categoriaRepository;

    @Override
    public List<CategoriaEntity> obtenerCategoria() {
        List<CategoriaEntity> listaCategorias = categoriaRepository.findAll();
        return listaCategorias;
    }
    @Override
    public CategoriaEntity guardarCategoria(CategoriaEntity categoriaEntity) {
        CategoriaEntity nuevaCategoria = categoriaRepository.save(categoriaEntity);
        return nuevaCategoria;
    }

    @Override
    public void borrarCategoriaPorId(Long id) {
            categoriaRepository.deleteById(id);
        }

    @Override
    public CategoriaEntity crearNuevaCategoria(CategoriaEntity nuevaCategoria) {
        CategoriaEntity categoriaParaGuardar = categoriaRepository.save(nuevaCategoria);
        return categoriaParaGuardar;
    }
}

