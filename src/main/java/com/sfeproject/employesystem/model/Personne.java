package com.sfeproject.employesystem.model;

import javax.persistence.*;
import java.sql.Date;

@MappedSuperclass
public class Personne {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
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

    public Personne() {
    }

    public Integer getCodeEmp() {
        return codeEmp;
    }

    public Integer getCodeRole() {
        return codeRole;
    }

    public Integer getCodeSomme() {
        return codeSomme;
    }

    public void setCodeEmp(Integer codeEmp) {
        this.codeEmp = codeEmp;
    }

    public void setCodeRole(Integer codeRole) {
        this.codeRole = codeRole;
    }

    public void setCodeSomme(Integer codeSomme) {
        this.codeSomme = codeSomme;
    }

    public String getSexeEmp() {
        return sexeEmp;
    }

    public void setSexeEmp(String sexeEmp) {
        this.sexeEmp = sexeEmp;
    }

    public Date getDateRecrutement() {
        return dateRecrutement;
    }

    public void setDateRecrutement(Date dateRecrutement) {
        this.dateRecrutement = dateRecrutement;
    }

    public String getPrenomEmp() {
        return prenomEmp;
    }

    public void setPrenomEmp(String prenomEmp) {
        this.prenomEmp = prenomEmp;
    }

    public String getNomEmp() {
        return nomEmp;
    }

    public void setNomEmp(String nomEmp) {
        this.nomEmp = nomEmp;
    }

    public String getTelEmp() {
        return telEmp;
    }

    public void setTelEmp(String telEmp) {
        this.telEmp = telEmp;
    }

    public String getEmailEmp() {
        return emailEmp;
    }

    public void setEmailEmp(String emailEmp) {
        this.emailEmp = emailEmp;
    }

    public String getAdresseEmp() {
        return adresseEmp;
    }

    public void setAdresseEmp(String adresseEmp) {
        this.adresseEmp = adresseEmp;
    }

    public String getAdresseTravail() {
        return adresseTravail;
    }

    public void setAdresseTravail(String adresseTravail) {
        this.adresseTravail = adresseTravail;
    }

    public String getMotPasse() {
        return motPasse;
    }

    public void setMotPasse(String motPasse) {
        this.motPasse = motPasse;
    }

    public String getCinEmp() {
        return cinEmp;
    }

    public void setCinEmp(String cinEmp) {
        this.cinEmp = cinEmp;
    }
}