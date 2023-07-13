package com.huichahue.proyectohuichahue.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.time.LocalDateTime;
import java.util.List;

@Entity // Datos que vamos a representar en la Base de datos
@Table(name = "productos")
@NoArgsConstructor//Constructor Vacío
@AllArgsConstructor//Constructor LLeno
@Getter//Getters
@Setter//Setters
public class ProductoEntity { //la clase es el molde - es publica porque debemos acceder desde otras capas

    @Id // PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Es una anotación auto incrementa IDENTITY porque es un identificador unico

    //Atributos de la tabla
    private Long productoId;
    private Long skuProducto;
    //private String categoriaiD;
    private String nombreProducto;
    private String descripcionProducto;
    private String formatoProducto;
    @Lob
    private byte[] imagenProducto; // ¿el tipo de dato es correcto?  la entidad Imagen tiene un campo datos de tipo byte[] para almacenar los bytes de la imagen. El atributo @Lob se utiliza para especificar que el campo datos debe ser tratado como un objeto de gran tamaño, lo cual es apropiado para el almacenamiento de imágenes.
    private Integer precioProducto; // tambien puede ser Integer
    private Long stockProducto;

    //Fechas de auditoria
    @CreationTimestamp//Indica que el atributo siguiente es una fecha de creación
    private LocalDateTime createdAt;
    @UpdateTimestamp//Indica cuando un atributo se actualizó
    private LocalDateTime updatedAt;


    // Indicamos que Productos es el dueño de la relacion
    @ManyToOne
    @JoinColumn(name= "categoria_id")//Indicamos el nombre de la columna donde está la llave foránea
    private CategoriaEntity categoriaProductos; //PREGUNTAR A ALE (Nos va a decir cual categoria es)

    //Tipo de Relación

    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "orden_productos",
            joinColumns = @JoinColumn(name = "productos_id"),
            inverseJoinColumns = @JoinColumn(name = "orden_id")
    )
    private List<OrdenEntity> OrdenProductos;




}
