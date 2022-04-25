package com.sfeproject.employesystem.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Data
@Entity
@Table(name = "employe")
public class Employe implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "CODE_EMP", nullable = false)
    private Integer codeEmp;

    @Column(name = "CODE_ROLE", nullable = false)
    private Integer codeRole;

    @Column(name = "CODE_SOMME")
    private Integer codeSomme;

    @Column(name = "SEXE_EMP")
    private String sexeEmp;

    @Column(name = "DATE_RECRUTEMENT")
    private Date dateRecrutement;

    @Column(name = "PRENOM_EMP")
    private String prenomEmp;

    @Column(name = "NOM_EMP")
    private String nomEmp;

    @Column(name = "TEL_EMP")
    private String telEmp;

    @Column(name = "EMAIL_EMP")
    private String emailEmp;

    @Column(name = "ADRESSE_EMP")
    private String adresseEmp;

    @Column(name = "ADRESSE_TRAVAIL")
    private String adresseTravail;

    @Column(name = "MOT_PASSE")
    private String motPasse;

    @Column(name = "CIN_EMP")
    private String cinEmp;

}
