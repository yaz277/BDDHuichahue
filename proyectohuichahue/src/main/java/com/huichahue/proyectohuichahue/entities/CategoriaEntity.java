package com.huichahue.proyectohuichahue.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.time.LocalDateTime;
import java.util.List;

//Las anotaciones se representan con @
@Entity // Datos que vamos a representar en la Base de datos
@Table(name = "categorias")
@NoArgsConstructor//Constructor Vacío
@AllArgsConstructor//Constructor LLeno
@Getter//Getters
@Setter//Setters
public class CategoriaEntity { //la clase es el molde - es publica porque debemos acceder desde otras capas

    @Id // PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto incrementa

    //Atributos de la tabla
    private Long categoriaId;
    private String nombreCategoria;
    private String descripcionCategoria;


    //Fechas de auditoria
    @CreationTimestamp//Indica que el atributo siguiente es una fecha de creación
    private LocalDateTime createdAt;
    @UpdateTimestamp//Indica cuando un atributo se actualizó
    private LocalDateTime updatedAt;

    @JsonIgnore // categoria le pertenece a productos
    @OneToMany(mappedBy = "categoriaProductos", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<ProductoEntity> productosCategoria;// traemos todos los productos asociados a esta categoria


}