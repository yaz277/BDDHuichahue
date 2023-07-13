package com.huichahue.proyectohuichahue.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.time.LocalDateTime;

@Entity // Datos que vamos a representar en la Base de datos
@Table(name= "clientes")
@NoArgsConstructor//Constructor Vacío
@AllArgsConstructor//Constructor LLeno
@Getter//Getters
@Setter//Setters
public class ClienteEntity { //la clase es el molde - es publica porque debemos acceder desde otras capas

    @Id // PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto incrementa

    //Atributos de la tabla
    private Long clienteId;
    private String nombreCliente;
    private String apellidoCliente;

    //private rutCliente;
    private String emailCliente;
    private Long celularCliente;
    private String calleCliente;
    private Long numeroCalleCliente;
    private Boolean casaDeptoCliente;
    private Long numeroCasaDeptoCliente;
    //private regionCliente;
    //private ciudadCliente;
    //private comunaCliente;

    //Fechas de auditoria
    @CreationTimestamp//Indica que el atributo siguiente es una fecha de creación
    private LocalDateTime createdAt;
    @UpdateTimestamp//Indica cuando un atributo se actualizó
    private LocalDateTime updatedAt;


}

