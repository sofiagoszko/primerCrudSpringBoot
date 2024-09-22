package com.crudrapido.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data; //agrega los set y los get

@Data
@Entity
@Table(name = "tbl_student") //nombre de la tabla en la base de datos
public class Student {
    @Id

    //campos de la tabla
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String firstName;
    private String lastName;
    @Column(name = "email_address", unique = true, nullable = false)
    private String email;
}
