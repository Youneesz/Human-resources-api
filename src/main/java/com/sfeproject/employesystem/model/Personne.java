package com.sfeproject.employesystem.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.sql.Date;

@MappedSuperclass
public class Personne {
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

    public Personne(String sexeEmp, Date dateRecrutement, String prenomEmp, String nomEmp, String telEmp, String emailEmp, String adresseEmp, String adresseTravail, String motPasse, String cinEmp) {
        this.sexeEmp = sexeEmp;
        this.dateRecrutement = dateRecrutement;
        this.prenomEmp = prenomEmp;
        this.nomEmp = nomEmp;
        this.telEmp = telEmp;
        this.emailEmp = emailEmp;
        this.adresseEmp = adresseEmp;
        this.adresseTravail = adresseTravail;
        this.motPasse = motPasse;
        this.cinEmp = cinEmp;
    }

    public Personne() {
    }
}
