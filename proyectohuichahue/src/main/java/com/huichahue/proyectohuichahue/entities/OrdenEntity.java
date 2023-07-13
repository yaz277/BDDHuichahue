package com.huichahue.proyectohuichahue.entities;

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
@Table(name = "ordenes") // va en plural
@NoArgsConstructor//Constructor Vacío
@AllArgsConstructor//Constructor LLeno
@Getter//Getters - accesadores para acceder los atributos
@Setter//Setters - mutadores para mutar los atributos
public class OrdenEntity { // va en singular - la clase es el molde - es publica porque debemos acceder desde otras capas

    @Id // PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto incrementa

    //Atributos de la tabla
    private Long ordenId;
    private Long unidadesDemandarOrden;
    private Long precioUnitarioOrden;
    private Boolean estadoOrden;

    //Fechas de auditoria
    @CreationTimestamp//Indica que el atributo siguiente es una fecha de creación
    private LocalDateTime createdAt;
    @UpdateTimestamp//Indica cuando un atributo se actualizó
    private LocalDateTime updatedAt;

    //Tipo de Relación
    @OneToOne
    private ClienteEntity clienteId;


    @ManyToMany
    @JoinTable(
            name = "orden_productos",
            joinColumns = @JoinColumn(name = "orden_id"),
            inverseJoinColumns = @JoinColumn(name = "productos_id")
    )
    private List<ProductoEntity> ProductosOrden;

}
