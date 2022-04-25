package com.sfeproject.employesystem.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "person")
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "dtype", nullable = false)
    private String dtype;

    @Column(name = "som", nullable = false)
    private Integer som;

    @Column(name = "cadre")
    private String cadre;

    @Column(name = "date_rec")
    private Date dateRec;

    @Column(name = "lieu_emp")
    private String lieuEmp;

    @Column(name = "lieu_habit")
    private String lieuHabit;

    @Column(name = "nom")
    private String nom;

    @Column(name = "password")
    private String password;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "sexe", nullable = false)
    private String sexe;

    @Column(name = "telephone")
    private String telephone;

}
